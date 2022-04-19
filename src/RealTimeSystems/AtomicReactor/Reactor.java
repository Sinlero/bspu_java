package RealTimeSystems.AtomicReactor;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Reactor {
    int level = 0;
    int max_level = 100;
    int min_level = 0;
    int setted_level = 0;

    AtomicInteger tact_number = new AtomicInteger(0);

    boolean stopped = false;

    Scanner scanner = new Scanner(System.in);
    /**
     * Поток, поднимающий стержень из реактора
     */
    Thread heigh = new Thread() {
        public void run() {
            while (!stopped) {
                try {
                    sleep(1500);
                    level++;
                    System.out.println("уровень повышен до " + level + ". Номер такта = " + tact_number.incrementAndGet());
                } catch (Exception pe) {
                    System.out.println("Error heigh: " + pe);
                }
            }
        }
    };
    /**
     * Поток, опускающий стержень в реактор
     */
    Thread low = new Thread() {
        public void run() {
            while (!stopped) {
                try {
                    sleep(1500);
                    level--;
                    System.out.println("уровень понижен до " + level  + ". Номер такта = " + tact_number.incrementAndGet());
                } catch (Exception pe) {
                    System.out.println("Error low: " + pe);
                }
            }
        }
    };

    Thread input = new Thread() {
        public void run() {
            while (!stopped) {
                try {
                    sleep(10);
                    System.out.println("Введите устанавливаемое значение: ");
                    level = scanner.nextInt();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    /**
     * Поток, опускающий стержень в реактор
     */
    Thread control = new Thread() {
        public void run() {
            while (!stopped) {
                try {
                    sleep(1500);
                    if (level >= max_level) {
                        System.out.println("Реактор заглох... уровень " + level);
                        stopped = true;
                        System.exit(0);
                    }
                    if (level <= min_level) {
                        System.out.println("Реактор взорвался... уровень " + level);
                        stopped = true;
                        System.exit(0);
                    }
                } catch (Exception pe) {
                    System.out.println("Error : " + pe);
                }
            }
        }
    };

    /**
     *
     */
    public Reactor(int level) {
        if (level < min_level || level > max_level) {
            System.out.println("Рабочее значение не соответствует допустимому");
            System.exit(1);
        }
        this.setted_level = level;
        this.level = level;
        control.setPriority(Thread.NORM_PRIORITY);    //NORM_PRIORITY MIN_PRIORITY
        low.setPriority(Thread.NORM_PRIORITY);
        heigh.setPriority(Thread.NORM_PRIORITY);
        input.setPriority(Thread.NORM_PRIORITY);

        control.start();
        heigh.start();
        low.start();
        input.start();
    }

    /**
     *
     */
    public static void main(String args[]) {
        System.out.println("Реактор запущен");
        new Reactor(50);
    }

}

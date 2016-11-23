/**
 * @author lifeandfree
 *         Пакет: ru.urfu.state
 *         Дата создания класса: 23 нояб. 2016 г.
 */
package ru.urfu.state.copymachine;

/**
 * @author lifeandfree
 */
public class WiFiPrint extends State {

    @Override
    public void doCase(Context context) throws Exception {
        super.doCase(context);
        System.out.println("Выбран документ с " + WiFiPrint.class.getName().toString());
        context.setDoc(true);

    }

    @Override
    public void doPrint(Context context) throws Exception {
        super.doPrint(context);
        System.out.println("Распечатан документ с " + WiFiPrint.class.getName().toString());
        context.setMoney(context.getMoney() - 1);
        context.setDoc(false);

    }
}

/**
 * @author lifeandfree
 *         Пакет: ru.urfu.state
 *         Дата создания класса: 23 нояб. 2016 г.
 */
package ru.urfu.state.copymachine;

/**
 * @author lifeandfree
 */
public abstract class State implements IState {

    @Override
    public void doCase(Context context) throws Exception {
        if (context.getMoney() == 0) {
            throw new Exception("Внесите пожалуйста денежные срества. Продолжение не возможно.");
        }
    }

    @Override
    public void doPrint(Context context) throws Exception {
        if (context.isDoc() == false) {
            throw new Exception("Веберите документ для печати!");
        }
    }

    @Override
    public void doTakeDelivery(Context context) throws Exception {
        if (context.getMoney() == 0) {
            throw new Exception("Нет денежных средства для возврата");
        }
        else {
            System.out.println("Возращаю деньги: " + context.getMoney());
            context.setMoney(0);
        }
    }

}

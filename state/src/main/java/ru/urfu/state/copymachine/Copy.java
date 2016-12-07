/**
 * @author lifeandfree
 *         Пакет: ru.urfu.state
 *         Дата создания класса: 23 нояб. 2016 г.
 */
package ru.urfu.state.copymachine;

/**
 * @author lifeandfree
 */
public class Copy extends State {
    private boolean doc;
    private int money;
    private State state;

    public Copy() {
        this.money = 0;
        this.doc = false;
        this.state = null;

    }

    public void doCase() {
        try {
            state.doCase(this);
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }

    public void doPrint() {
        try {
            state.doPrint(this);
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }

    public void doTakeDelivery() {
        try {
            state.doTakeDelivery(this);
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }

    /**
     * @return the money
     */
    public int getMoney() {
        return money;
    }

    /**
     * @return the state
     */
    public State getState() {
        return state;
    }

    /**
     * @return the doc
     */

    protected boolean isDoc() {
        return doc;
    }

    /**
     * @param doc
     *            the doc to set
     */
    protected void setDoc(boolean doc) {
        this.doc = doc;
    }

    /**
     * @param money
     *            the money to set
     */
    public void setMoney(int money) {
        this.money = money;
        System.out.println("Денежные средства: " + money);
    }

    /**
     * @param state
     *            the state to set
     */
    public void setState(State state) {
        this.state = state;
    }

}

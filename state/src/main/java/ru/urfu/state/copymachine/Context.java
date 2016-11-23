/**
 * @author lifeandfree
 *         Пакет: ru.urfu.state
 *         Дата создания класса: 23 нояб. 2016 г.
 */
package ru.urfu.state.copymachine;

/**
 * @author lifeandfree
 */
public class Context {
    private boolean doc;
    private int money;

    public Context() {
        this.money = 0;
        this.doc = false;

    }

    public Context(int money) {
        setMoney(money);
        this.doc = false;
    }

    /**
     * @return the money
     */
    public int getMoney() {
        return money;
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

}

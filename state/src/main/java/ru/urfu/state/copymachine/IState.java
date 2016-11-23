package ru.urfu.state.copymachine;

public interface IState {

    public void doCase(Context context) throws Exception;

    public void doPrint(Context context) throws Exception;

    public void doTakeDelivery(Context context) throws Exception;
}

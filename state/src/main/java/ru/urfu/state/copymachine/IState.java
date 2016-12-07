package ru.urfu.state.copymachine;

public interface IState {

    public void doCase(Copy context) throws Exception;

    public void doPrint(Copy context) throws Exception;

    public void doTakeDelivery(Copy context) throws Exception;
}

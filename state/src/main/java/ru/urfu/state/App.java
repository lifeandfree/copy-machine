package ru.urfu.state;

import ru.urfu.state.copymachine.Copy;
import ru.urfu.state.copymachine.FlashPrint;
import ru.urfu.state.copymachine.WiFiPrint;

public class App {
    public static void main(String[] args) {

        Copy copy = new Copy();
        FlashPrint flashPrint = new FlashPrint();
        copy.setMoney(10);
        copy.setState(flashPrint);
        copy.doCase();
        copy.doPrint();
        copy.doTakeDelivery();

        copy.setMoney(3);
        WiFiPrint wiFiPrint = new WiFiPrint();
        copy.setState(wiFiPrint);
        copy.doCase();
        copy.doPrint();

        copy.doPrint();

        copy.doCase();
        copy.doPrint();
        copy.doTakeDelivery();

        copy.doCase();

    }
}

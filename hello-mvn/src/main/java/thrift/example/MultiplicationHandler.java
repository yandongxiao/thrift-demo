package thrift.example;

import tutorial.MultiplicationService;

public class MultiplicationHandler implements MultiplicationService.Iface {

    @Override
    public int multiply(int n1, int n2) {
        System.out.println("Multiply(" + n1 + "," + n2 + ")");
        return n1 * n2;
    }
}

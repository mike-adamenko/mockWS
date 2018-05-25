package com.adamenko.mockws;

import java.util.ArrayList;
import java.util.List;

public class MockEntity1 {

    private  String property1;
    private  String property2;
    String resultStatus = "OK";
    String resultMessage = "";


    List<Child> attributeList= new ArrayList<>();

    MockEntity1(){}

    public MockEntity1(String property1, String property2) {
        this.property1 = property1;
        this.property2 = property2;
        Child child = new Child();
        child.name ="child";
        child.qty=5;
        child.childProp1 ="2018-09-01T12:00:00Z";
        child.childProp2 ="2018-01-01T12:00:00Z";
        attributeList.add(child);
        Child child2 = new Child();
        child2.name ="child2";
        child2.qty=15;
        child2.childProp1 ="2018-09-02T12:00:00Z";
        child2.childProp2 ="2018-01-02T12:00:00Z";
        attributeList.add(child2);
    }

    public String getProperty1() {
        return property1;
    }

    public void setProperty1(String property1) {
        this.property1 = property1;
    }

    public String getProperty2() {
        return property2;
    }

    public void setProperty2(String property2) {
        this.property2 = property2;
    }

    public String getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(String resultStatus) {
        this.resultStatus = resultStatus;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public List<Child> getAttributeList() {
        return attributeList;
    }

    public void setAttributeList(List<Child> attributeList) {
        this.attributeList = attributeList;
    }

    class Child {
        String name;
        Integer qty;
        String childProp1;
        String childProp2;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getQty() {
            return qty;
        }

        public void setQty(Integer qty) {
            this.qty = qty;
        }

        public String getChildProp1() {
            return childProp1;
        }

        public void setChildProp1(String childProp1) {
            this.childProp1 = childProp1;
        }

        public String getChildProp2() {
            return childProp2;
        }

        public void setChildProp2(String childProp2) {
            this.childProp2 = childProp2;
        }
    }
}

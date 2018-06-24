package com.example.rafay.billcalculator;

public class Data {
    private int _id, _previousUnit, _nextUnit;

    public Data() {
    }

    public Data(int previousUnit, int nextUnit) {
        this._previousUnit = previousUnit;
        this._nextUnit = nextUnit;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public int get_previousUnit() {
        return _previousUnit;
    }

    public void set_previousUnit(int _previousUnit) {
        this._previousUnit = _previousUnit;
    }

    public int get_nextUnit() {
        return _nextUnit;
    }

    public void set_nextUnit(int _nextUnit) {
        this._nextUnit = _nextUnit;
    }

}

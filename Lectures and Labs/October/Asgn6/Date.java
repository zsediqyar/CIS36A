class Date {
    int day, month, year;
    
    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    int daySinceJan1() {
        int temp, result = 0;
        if(month == 1)  { result = day; return result; }
        if(month == 2)  { temp = 30; result = day + temp; return result; }
        if(month == 3)  { temp = 30 * 2; result = temp + day; return result; }
        if(month == 4)  { temp = 30 * 3; result = temp + day; return result; }
        if(month == 5)  { temp = 30 * 4; result = temp + day; return result; }
        if(month == 6)  { temp = 30 * 5; result = temp + day; return result; }
        if(month == 7)  { temp = 30 * 6; result = temp + day; return result; }
        if(month == 8)  { temp = 30 * 7; result = temp + day; return result; }
        if(month == 9)  { temp = 30 * 8; result = temp + day; return result; }
        if(month == 10) { temp = 30 * 9; result = temp + day; return result; }
        if(month == 11) { temp = 30 * 10; result = temp + day; return result; }
        if(month == 12) { temp = 30 * 11; result = temp + day; return result; }

        return result;
    }
}
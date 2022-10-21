package solutions;

import java.text.ParseException;

public class DiffInDate{
public static void main(String[] args) throws ParseException {
String s = "our indipendence day is on 15­07­1977.26­01­1950";
System.out.println(Difference(s));
}
public static int Difference(String s) {
///­­­­­­­start­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­
int i;
int year1 = 0, year2 = 0;
int flag = 1;
for (i = 0; i < s.length() && flag == 1; i++) {
if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
year1 = Integer.parseInt("" + s.charAt(i + 6) + s.charAt(i + 7)
+ s.charAt(i + 8) + s.charAt(i + 9));
flag = 0;
}
}
i = i + 9;
flag = 1;
for (; i < s.length() && flag == 1; i++) {
if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
year2 = Integer.parseInt("" + s.charAt(i + 6) +
s.charAt(i + 7) + s.charAt(i + 8) + s.charAt(i + 9));
flag = 0;
}
}
return Math.abs(year2-year1);
}
}
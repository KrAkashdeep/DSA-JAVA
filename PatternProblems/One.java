// 1st (print empty box)
// class One {
// public static void main(String[] args) {
// for (int i = 1; i < 10; i++) {
// for (int j = 1; j < 20; j++) {
// if (i == 1 || i == 9 || j == 1 || j == 19) {

// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }
// }

// 2nd (print 8)
// public class One {

// public static void main(String[] args) {
// for (int i = 1; i < 10; i++) {
// for (int j = 1; j < 10; j++) {
// if (i == 1 || i == 5 || i == 9 || j == 1 || j == 9) {
// System.out.print("*");
// } else {
// System.out.print(" ");

// }
// }
// System.out.println();
// }
// }
// }

// 3rd (flag shape)
// public class One {

// public static void main(String[] args) {
// for (int i = 1; i < 10; i++) {
// for (int j = 1; j < 15; j++) {
// if (i == 1 || i == 3 || i == 5 || j == 1) {
// System.out.print("*");
// } else {
// System.out.print(" ");

// }
// }
// System.out.println();
// }
// }
// }

// 4th(print U)

// public class One {

// public static void main(String[] args) {
// for (int i = 1; i < 10; i++) {
// for (int j = 1; j < 10; j++) {
// if (j == 9 || j == 1 || i == 9) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }
// }

// 5th (X print)

// public class One {

// public static void main(String[] args) {
// for (int i = 1; i < 10; i++) {
// for (int j = 1; j < 10; j++) {
// if (i == j || i + j == 10) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }
// }

// 6th (butterfly)

// public class One {

// public static void main(String[] args) {
// for (int i = 1; i < 10; i++) {
// for (int j = 1; j < 10; j++) {
// if (i == j || i + j == 10 || j == 1 || j == 9) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }
// }
// 7th

// public class One {

// public static void main(String[] args) {
// for (int i = 1; i < 10; i++) {
// for (int j = 1; j < 10; j++) {
// if (i <= j) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }
// }
// 8th

// public class One {

// public static void main(String[] args) {
// for (int i = 1; i < 10; i++) {
// for (int j = 1; j < 10; j++) {
// if (i >= j) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }
// }

// 9th

// public class One {

// public static void main(String[] args) {
// for (int i = 1; i < 10; i++) {
// for (int j = 1; j < 10; j++) {
// if (i == j || j == 1 || i == 9) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }
// }

// 10th

// public class One {

// public static void main(String[] args) {
// for (int i = 1; i < 10; i++) {
// for (int j = 1; j < 10; j++) {
// if (i == j || j == 9 || i == 1) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }
// }

// 11

// public class One {

// public static void main(String[] args) {
// for (int i = 1; i < 10; i++) {
// for (int j = 1; j < 10; j++) {
// if (i == j || j == 1 || i == 9) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }
// }

// 12(triangle)

// public class One {

// public static void main(String[] args) {
// int m = 7, n = 12;
// for (int i = 1; i < m; i++) {
// for (int j = 1; j < n / 2; j++) {
// if (i + j >= Math.floorDivExact(n, 2) + 1 || j == Math.floorDivExact(n, 2) ||
// i == m - 1) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }

// for (int k = 2; k < i; k++) {
// System.out.print("*");
// }

// System.out.println();
// }
// }
// }

// 13(diamond)

// public class One {

// public static void main(String[] args) {
// int m = 7, n = 12;

// for (int i = 1; i < m; i++) {
// for (int j = 1; j < n / 2; j++) {
// if (i + j >= Math.floorDivExact(n, 2) + 1 || j == Math.floorDivExact(n, 2)) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }
// for (int k = 2; k < i; k++) {
// System.out.print("*");
// }

// System.out.println();
// }
// for (int j = n / 2 - 1; j > 0; j--) {
// for (int i = 1; i < m - 1; i++) {
// if (i + j >= Math.floorDivExact(n, 2) + 1 || j == Math.floorDivExact(n, 2)) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }

// for (int k = 2; k < j; k++) {
// System.out.print("*");
// }

// System.out.println();
// }
// }
// }
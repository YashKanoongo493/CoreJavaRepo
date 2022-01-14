package excercise4_14;

public class SecondLargest_16 {
	public static void main(String[] args) {
		int[] a = { 12900, 1500, 267700, 400000000 };

		for (int i = 0; i < a.length; i++) {

			if (a[0] > a[1]) {

				if (a[0] > a[2]) {
					if (a[0] > a[3]) {
						System.out.println(a[0]);

						break;

					} else {

						System.out.println(a[3]);

						break;

					}

				} else {

					if (a[2] > a[3]) {

						System.out.println(a[2]);

						break;

					} else {

						System.out.println(a[3]);

						break;

					}

				}

			} else {

				if (a[1] > a[2]) {

					if (a[1] > a[3]) {

						System.out.println(a[1]);

						break;

					} else {

						System.out.println(a[3]);

					}

				}

			}

		}
	}
	}

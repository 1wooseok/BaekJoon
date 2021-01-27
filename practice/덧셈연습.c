#include <stdio.h>

void plus(int x, int y) {
	int copy = y;
	int three = 0;
	int four = 0;
	int five = 0;

	while(1) {
		if (copy < 1000 && copy > 99) {
			five = (copy / 100) * x;
			copy = copy % 100;
		}
		else if (copy < 100 && copy > 9) {
			four = (copy / 10) * x;
			copy = copy % 10;
		}
		else {
			three = copy * x;
			break;
		}
	}
	int result = (three) + (10 * four) + (100 * five);

	printf("%d\n%d\n%d\n%d", three,four,five,result);
}
int main() {
	int a = 472;
	int b = 385;

	plus(a, b);
	return 0;
}
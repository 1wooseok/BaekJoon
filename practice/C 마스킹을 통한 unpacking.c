#include <stdio.h>
#include <stdlib.h>
#include <limits.h>
#include <unistd.h>

void print_sign(int);
void moving_sign(char, char, char, char);

int main(void) {
  printf("%d\n", CHAR_BIT);
  moving_sign('H', 'E', 'Y', ' ');
  return 0;
}

void print_sign(int a) {
  printf(" %c %c %c %c \n",
  a/(256*256*256), a/(256*256), a/256, a);
}

void moving_sign(char _a, char _b, char _c, char _d) {
  char a = _a, b = _b, c = _c, d = _d, tmp;
  int p;

  p = a; // 문자의 ASCII_CODE 저장
  p = (p << CHAR_BIT) | b; // 비트연산을 통한 masking 과정?
  p = (p << CHAR_BIT) | c;
  p = (p << CHAR_BIT) | d;
  

  while(1) {
    system("clear");
    print_sign(p); 
    slep(1);
    tmp = p/(256*256*256); // 최상위 문자 tmp에 저장
    p = (p << CHAR_BIT) | tmp; // p를 문자만큼 이동
  }
}



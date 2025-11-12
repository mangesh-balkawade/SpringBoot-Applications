package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {
	// int
	reader := bufio.NewReader(os.Stdin)

	// error ok syantax try catch type
//  try catch 
//       error
	str1, err := reader.ReadString('\n')
	if err==nil{
		panic(err)
	}
	no1, _ := strconv.Atoi(strings.TrimSpace(str1))
	fmt.Println(no1)

	no2, _ := strconv.ParseFloat(strings.TrimSpace(str1), 64)
	fmt.Println(no2)

}

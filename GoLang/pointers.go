package main

import (
	"fmt"
)

func main() {

	var no1 int = 10
	var ptr *int = &no1
	fmt.Println(ptr)

	arr:=[]int{1,2,3,4}

	ptr2 := & arr 
	for i:=0;i<len(arr);i++{
		fmt.Println(*ptr2)
		ptr++
	}

}

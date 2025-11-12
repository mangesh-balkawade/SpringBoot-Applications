package main

import "fmt"
import "strings"

func main() {
	str1 := "Mangesh Balkawade"
	arr := strings.Split(str1, " ")
	fmt.Print(arr)
	//	strev := ""
	// for i := len(arr) - 1; i >= 0; i-- {
	//    strev+=arr[i]
	// }
	// fmt.Print(strev)

	str2 := "Mangesh"

	for i, j := 0, len(str2)-1; i < j; i, j = i+1, j-1 {
	}

}

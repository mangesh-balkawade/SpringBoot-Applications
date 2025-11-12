package main

import (
	"bytes"
	"fmt"
	"sort"
)


func main() {

	var arr1 = []int{5, 4, 3, 2, 1}
	//sort.Ints(arr1)
	arr1=merge(arr1)
	for i := 0; i < len(arr1); i++ {
		fmt.Println(arr1[i])
	}

	 str1 := "Mangesh Balkawade"



}

func merge(arr []int) []int {
	if len(arr) == 1 {
		return arr
	}

	left := arr[0:(len(arr) / 2)]
	left = merge(left)

	right := arr[len(arr)/2:]
	right = merge(right)

	return merger(left, right)

}

func merger(l []int, r []int) []int {
	var i = 0
	var j = 0
	var k = 0
	var mix = make([]int, len(l)+len(r))

	for i < len(l) && j < len(r) {
		if l[i] < r[j] {
			mix[k] = l[i]
			i++
		} else {
			mix[k] = r[j]
			j++
		}
		k++
	}

	for i < len(l) {
		mix[k] = l[i]
		i++
		k++
	}

	for j < len(r) {
		mix[k] = r[j]
		j++
		k++

	}
	return mix
}

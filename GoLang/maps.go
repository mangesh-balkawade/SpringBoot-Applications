package main

import (
	"fmt"
)

func main() {
	map1 := make(map[string]int)
	map1["Mangesh"] = 150000
	for key, value := range map1 {
		fmt.Print(key, value)
	}
	map1 = charFreq("Maangesh")
	fmt.Print(map1)
}

func charFreq(str string) map[string]int {
	map1 := make(map[string]int)
	for i := 0; i < len(str); i++ {
		_, value := map1[string(str[i])]
		if value {
			map1[string(str[i])] = map1[string(str[i])] + 1
		} else {
			map1[string(str[i])] = 1
		}
	}
	return map1



}

package main
import "fmt"

func main(){

	var obj1 struct
	obj1.name="Mangesh"
	obj1.id=1
	obj1.email="mangesh@gmail.com"
	fmt.Println(obj1)
}

type Employee struct{
	name string,
	id int,
	email string
}
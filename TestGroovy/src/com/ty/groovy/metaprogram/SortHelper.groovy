package com.ty.groovy.metaprogram

class SortHelper {
	def list

	public SortHelper(list) {
		this.list = list
	}

	//所有的以sort开头的方法都来调用“invokeMethod”，当然，其他方法也有可能//来调用它，但我不做处理。
	def invokeMethod(String name,Object args)
	{
		//首先判断方法名是否以“sortBy”开头，是则处理，否则不处理。
		if(name.indexOf('sortBy')==0)
		{
			//取得属性名，如“ChinScore”
			name = name[6..name.length()-1]

			//把第一个字母由大写变小写，就取得了属性名
			name = name[0].toLowerCase()+name[1..name.length()-1]

			//实现Comparator接口，大家可以参考jdk文档。
			def comparator = { node1,node2 ->
				return node1."${name}".compareTo(node2."${name}")
			} as Comparator
			
			//排序
			Collections.sort(this.list,comparator)
		}
	}
	static main(args){
		List scores = [new Student(no:'123',name:'Tom',chinScore:90,mathScore:99)]
		scores+=new Student(no:'124',name:'Mike',chinScore:88,mathScore:90)
		scores+=new Student(no:'125',name:'Alice',chinScore:100,mathScore:55)

		def sorter = new SortHelper(scores)
		sorter.sortByMathScore()
		scores.each{
			println it.name + ":"+it.mathScore
		}
	}
}

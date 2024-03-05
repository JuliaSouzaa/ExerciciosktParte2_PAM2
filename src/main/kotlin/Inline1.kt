package kotlin

incline fun transacao(funcao: () -> Unit) {
	println("abrindo transação...")
	try {
	     funcao()	
	}finally {
	     println("fechando trnsação")
	}
}

fun main(args: Array<String>) {
	transacao {
	    println("Executando SQL 1...")
	    println("Executando SQL 2...")
	    println("Executando SQL 3...")
	}
}


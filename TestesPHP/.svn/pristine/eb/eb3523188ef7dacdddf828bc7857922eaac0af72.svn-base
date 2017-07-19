/**
 * Funcao a qual somente permite a digitacao de numeros
 * 
 * (IE/CHROME/FIREFOX)
 * @param e
 * @returns {Boolean}
 */

function onlyDigit(e) {
	var tecla = (window.event) ? event.keyCode : e.which;
	if ((tecla > 47 && tecla < 58))
		return true;
	else {
		if (tecla == 8 || tecla == 0)
			return true;
		else
			return false;
	}
}

/**
 * Verifica se um elemento ultrapassou o tamanho limite.
 * 
 * @param idElement
 * @param limit
 * @returns {Boolean}
 */
function verifyStringLength(idElement, limit) {
	
	var element = this.document.getElementById(idElement);
	
	if (element == null) {
		alert("Error: element not found: "+text);
		return false;
	}
	
	if (element.value.length >= limit) {
		return false;
	} else {
		return true;
	}
}

/**
 * Verifica se o que esta sendo digitado eh numero e o
 * tamanho do valor esta dentro do limite especificado.
 * 
 * @param e
 * @param idElement
 * @param limit
 * @returns {Boolean}
 */

function digitAndLength(e, idElement, limit) {
	
	return (onlyDigit(e) && verifyStringLength(idElement, limit));
	
}

/**
 * 
 * Hack utilizado para simular a propriedade Disable em conjunto à classe CSS isDisable.
 * Esta solução é devido ao fato do Internet Explorer não permitir que a cor da fonte
 * do componente seja mudado! Hirgh!!!!!!!
 * 
 * @param e
 * @returns {Boolean}
 */
function lockInput(e) {
	return false;
}
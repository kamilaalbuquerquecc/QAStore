package br.com.QAStore.utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

//Calse que formata como a data e hora ficará visivel no nome do arquivo de screen e folder
public class DataHoraScreen {

	public static String dataHoraArquivo() {
		
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		
		return new SimpleDateFormat("yyyy_MM_hh_mm_ss").format(ts);
	}

}

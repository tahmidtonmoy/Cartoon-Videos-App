
package com.tahmid.cartoonvideos;

import java.util.ArrayList;
import java.util.HashMap;

public class  MakeVideoList {

	public static ArrayList< ArrayList<HashMap<String,String>> > rootArrayList;
	public static ArrayList< HashMap<String, String> > catArrayList;
	public static ArrayList< HashMap<String, String> > videoArrayList;
	public static HashMap<String, String> hashMap;


	//--------------------------------------------------------------------------------------------
	//===============================Some automation by Juba
	public static void addVideoItem(String video_id, String title, String desciption){
		hashMap = new HashMap<>();
		hashMap.put("vdo_id", video_id);
		hashMap.put("vdo_title", title);
		hashMap.put("vdo_desciption", desciption);
		videoArrayList.add(hashMap);
	}
	//========================================================================
	//===============================Some automation by Juba
	public static void createPlayList(String category_name, Integer drawable){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================





	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//----------------------------------------------------
	public static void createMyAlbums(){

		rootArrayList = new ArrayList();
		catArrayList = new ArrayList<>();
		videoArrayList = new ArrayList<>();

		//==========================================================================
		addVideoItem("J2JolQHIX9Q", "Gopal Bhar", "Episode 01");
		addVideoItem("cHL_znqU8M0", "Gopal Bhar", "Episode 02");
		addVideoItem("VKkp0EpA70c", "Gopal Bhar", "Episode 03");
		addVideoItem("n1iI55Z2N-Q", "Gopal Bhar", "Episode 04");
		addVideoItem("CsiqM2jN6Cw", "Gopal Bhar", "Episode 05");
		addVideoItem("OaRfhq7n5gA", "Gopal Bhar", "Episode 06");
		addVideoItem("UxmloB4XtG0", "Gopal Bhar", "Episode 07");
		addVideoItem("tGNpQvV-Nfk", "Gopal Bhar", "Episode 08");
		addVideoItem("29mCZkYTVWk", "Gopal Bhar", "Episode 09");
		addVideoItem("NsWJJuvCV34", "Gopal Bhar", "Episode 10");
		addVideoItem("KT_KKhcKsMA", "Gopal Bhar", "Episode 11");
		addVideoItem("NsWJJuvCV34", "Gopal Bhar", "Episode 12");
		addVideoItem("RHdFpt0RHLU", "Gopal Bhar", "Episode 13");
		addVideoItem("a42HUnJPC5k", "Gopal Bhar", "Episode 14");
		addVideoItem("vPNk7VMkoEE", "Gopal Bhar", "Episode 15");
		addVideoItem("qkhwW7S6BCU", "Gopal Bhar", "Episode 16");
		addVideoItem("M-P3l-c8CPQ", "Gopal Bhar", "Episode 17");
		addVideoItem("8QP3Onkc98c", "Gopal Bhar", "Episode 18");
		addVideoItem("_BwkPcw0mco", "Gopal Bhar", "Episode 19");
		addVideoItem("UL_ng94I-Ys", "Gopal Bhar", "Episode 20");
		addVideoItem("D5ZRDHy87uM", "Gopal Bhar", "Episode 21");
		addVideoItem("f3zshcgb0Xc", "Gopal Bhar", "Episode 22");
		addVideoItem("eu80MPhHFqs", "Gopal Bhar", "Episode 23");
		addVideoItem("1sR4XxCAg7g", "Gopal Bhar", "Episode 24");
		addVideoItem("TWphFvJw6EE", "Gopal Bhar", "Episode 25");
		addVideoItem("qmk-9Qz1izg", "Gopal Bhar", "Episode 26");
		addVideoItem("w-dDodpLT18", "Gopal Bhar", "Episode 27");
		addVideoItem("qmk-9Qz1izg", "Gopal Bhar", "Episode 28");
		addVideoItem("aBHx8Jaq_Yo", "Gopal Bhar", "Episode 29");
		addVideoItem("caBon_lP_II", "Gopal Bhar", "Episode 30");
		addVideoItem("6nM_PVtNyb8", "Gopal Bhar", "Episode 31");
		addVideoItem("zfiSY9PNG7s", "Gopal Bhar", "Episode 32");
		addVideoItem("vRs4s-9HS1Q", "Gopal Bhar", "Episode 33");
		addVideoItem("d8YiqT3BOSY", "Gopal Bhar", "Episode 34");
		addVideoItem("gKP8WxrMPSo", "Gopal Bhar", "Episode 35");
		addVideoItem("OvqHCD2XXGQ", "Gopal Bhar", "Episode 36");
		addVideoItem("hEGeW6U5Kek", "Gopal Bhar", "Episode 37");
		addVideoItem("klNaTPAtrRY", "Gopal Bhar", "Episode 38");
		addVideoItem("OF3kTE0GSz8", "Gopal Bhar", "Episode 39");
		addVideoItem("hxtesR-lpW4", "Gopal Bhar", "Episode 40");
		addVideoItem("1YJSqP9u2j0", "Gopal Bhar", "Episode 41");
		addVideoItem("eD9qTbXqwyg", "Gopal Bhar", "Episode 42");
		addVideoItem("oPPpYXIfmPY", "Gopal Bhar", "Episode 43");
		addVideoItem("TEkrptQAWGo", "Gopal Bhar", "Episode 44");
		addVideoItem("HwBp5WkKRcs", "Gopal Bhar", "Episode 45");
		addVideoItem("yBT8obyeXX4", "Gopal Bhar", "Episode 46");
		addVideoItem("2-aiPYi5q40", "Gopal Bhar", "Episode 47");
		addVideoItem("04lcxdcbsxc", "Gopal Bhar", "Episode 48");
		addVideoItem("DpDlMihnPhg", "Gopal Bhar", "Episode 49");
		addVideoItem("zvuFFk56Ods", "Gopal Bhar", "Episode 50");
		addVideoItem("jS08VN-0uL0", "Gopal Bhar", "Episode 51");
		addVideoItem("OZvzl8o014k", "Gopal Bhar", "Episode 52");
		addVideoItem("1J5XEZ1sUqU", "Gopal Bhar", "Episode 53");
		addVideoItem("qM0Jo8VNfUo", "Gopal Bhar", "Episode 54");
		addVideoItem("RuvX0Pq52HI", "Gopal Bhar", "Episode 55");
		addVideoItem("uCO4PKM1Ncc", "Gopal Bhar", "Episode 56");
		addVideoItem("uJZBIgH4P4Q", "Gopal Bhar", "Episode 57");
		addVideoItem("cLh2v6FMgrA", "Gopal Bhar", "Episode 58");
		addVideoItem("9RorIDzKXcg", "Gopal Bhar", "Episode 59");
		addVideoItem("Xw0m7m6NwYw", "Gopal Bhar", "Episode 60");
		addVideoItem("0KXJAiR9omI", "Gopal Bhar", "Episode 61");
		addVideoItem("sOoWYCSmMHE", "Gopal Bhar", "Episode 62");
		addVideoItem("_abZlWQrRhs", "Gopal Bhar", "Episode 63");
		addVideoItem("W0gAMdX4MT4", "Gopal Bhar", "Episode 64");
		addVideoItem("pALXcO4NDfQ", "Gopal Bhar", "Episode 66");
		addVideoItem("sHJhgSG8VvM", "Gopal Bhar", "Episode 67");
		addVideoItem("E1DwBBn55c4", "Gopal Bhar", "Episode 68");
		addVideoItem("xtihUw90Zkk", "Gopal Bhar", "Episode 69");
		addVideoItem("JrtMIQaetLE", "Gopal Bhar", "Episode 70");
		addVideoItem("lK5WKD48JbA", "Gopal Bhar", "Episode 71");
		addVideoItem("nOVt0oR5HbM", "Gopal Bhar", "Episode 72");
		addVideoItem("YvwfHZmQqZU", "Gopal Bhar", "Episode 73");
		addVideoItem("ywiazdxnUpE", "Gopal Bhar", "Episode 74");
		addVideoItem("1nMprZ7ERho", "Gopal Bhar", "Episode 75");
		addVideoItem("ieZy3binYCg", "Gopal Bhar", "Episode 76");
		addVideoItem("qkhwW7S6BCU", "Gopal Bhar", "Episode 77");
		addVideoItem("EFIx3YITJ78", "Gopal Bhar", "Episode 78");
		addVideoItem("BOG_tI5CJLA", "Gopal Bhar", "Episode 79");
		addVideoItem("hiVvFndRE54", "Gopal Bhar", "Episode 80");
		addVideoItem("n9-_X_3ruAA", "Gopal Bhar", "Episode 81");
		addVideoItem("4nJhROzgFpA", "Gopal Bhar", "Episode 82");
		addVideoItem("DlDyBywXXIs", "Gopal Bhar", "Episode 83");
		addVideoItem("2h1ylb-9L8M", "Gopal Bhar", "Episode 84");
		addVideoItem("GYHetcodWDk", "Gopal Bhar", "Episode 85");
		addVideoItem("d8_57_iRrGs", "Gopal Bhar", "Episode 86");
		addVideoItem("6LMTUbHwMhs", "Gopal Bhar", "Episode 87");
		addVideoItem("u-3XXHnSHtA", "Gopal Bhar", "Episode 88");
		addVideoItem("rt61b6HzMpk", "Gopal Bhar", "Episode 89");
		addVideoItem("blOGiDO_JF8", "Gopal Bhar", "Episode 90");
		addVideoItem("JfeetB9veh8", "Gopal Bhar", "Episode 91");
		addVideoItem("4tDAuHFoTlU", "Gopal Bhar", "Episode 92");
		addVideoItem("HUBtmvFafl0", "Gopal Bhar", "Episode 93");
		addVideoItem("HH0bScPX2TQ", "Gopal Bhar", "Episode 94");
		addVideoItem("cwqfCo-Ng_w", "Gopal Bhar", "Episode 95");
		addVideoItem("5Nm_6nr5E6c", "Gopal Bhar", "Episode 96");
		addVideoItem("O_Y21JJSfrw", "Gopal Bhar", "Episode 97");
		addVideoItem("SpGgJNpvyR8", "Gopal Bhar", "Episode 98");
		addVideoItem("RPKU0ur7R04", "Gopal Bhar", "Episode 99");
		addVideoItem("jR33IVioeXc", "Gopal Bhar", "Episode 100");

		createPlayList("Gopal Bhar", R.drawable.gopalbharg);
		//==========================================================================

		//==========================================================================
		addVideoItem("q_H4RRL-Cks", "Doraemon", "Episode 01");
		addVideoItem("kLs3CTAZkP4", "Doraemon", "Episode 02");
		addVideoItem("HvdOJ_8kRfE", "Doraemon", "Episode 03");
		addVideoItem("mGAmDhhvDac", "Doraemon", "Episode 04");
		addVideoItem("KNnbpD6jDzs", "Doraemon", "Episode 05");
		addVideoItem("3cOkhB5KKYE", "Doraemon", "Episode 06");
		addVideoItem("0oJmNhbMbC0", "Doraemon", "Episode 07");
		addVideoItem("yFEmE5jh71E", "Doraemon", "Episode 08");
		addVideoItem("aZF2ITMLbF8", "Doraemon", "Episode 09");
		addVideoItem("Da39mitQgts", "Doraemon", "Episode 10");
		addVideoItem("PRwTElTfUPM", "Doraemon", "Episode 11");
		addVideoItem("o2pCF1QSfm0", "Doraemon", "Episode 12");
		addVideoItem("b19Os5TcjH8", "Doraemon", "Episode 13");
		addVideoItem("lN_7-l9AD0Y", "Doraemon", "Episode 14");
		addVideoItem("JWKgHTUFkkI", "Doraemon", "Episode 15");
		addVideoItem("mJeuS_1xnlk", "Doraemon", "Episode 16");
		addVideoItem("ZvTr1oTl7Oc", "Doraemon", "Episode 17");
		addVideoItem("Mp8FuEYfXOE", "Doraemon", "Episode 18");
		addVideoItem("iD1EMOnXQrM", "Doraemon", "Episode 19");
		addVideoItem("N1Q9UVeiUYk", "Doraemon", "Episode 20");
		addVideoItem("R0F4nSz6RCo", "Doraemon", "Episode 21");
		addVideoItem("TWDlEZUQ8J8", "Doraemon", "Episode 22");
		addVideoItem("7_6c6-6ZlrU", "Doraemon", "Episode 23");
		addVideoItem("NL7PgJYlEVo", "Doraemon", "Episode 24");
		addVideoItem("L17Rbv0ERPE", "Doraemon", "Episode 25");
		addVideoItem("iCnm7QWF_dY", "Doraemon", "Episode 26");
		addVideoItem("B0J18GNth-s", "Doraemon", "Episode 27");
		addVideoItem("UwitXtYFHtg", "Doraemon", "Episode 28");
		addVideoItem("ZSE26nGJPL0", "Doraemon", "Episode 29");
		addVideoItem("lCnCQWf4FKk", "Doraemon", "Episode 30");
		addVideoItem("FA-79MkAH2Q", "Doraemon", "Episode 31");
		addVideoItem("Px-uHlXCmJo", "Doraemon", "Episode 32");
		addVideoItem("rO13kiqkcXM", "Doraemon", "Episode 33");
		addVideoItem("7TNe9Ah0B4A", "Doraemon", "Episode 34");
		addVideoItem("CPlwpkRT8K4", "Doraemon", "Episode 35");
		addVideoItem("ZB5dc7mwwtE", "Doraemon", "Episode 36");
		addVideoItem("x8I7whLCyPU", "Doraemon", "Episode 37");
		addVideoItem("0oeF4LH33mA", "Doraemon", "Episode 38");
		addVideoItem("9q-TesTU6CM", "Doraemon", "Episode 39");
		addVideoItem("wVV0W96tx7k", "Doraemon", "Episode 40");
		addVideoItem("q5FywqqjT8o", "Doraemon", "Episode 41");
		addVideoItem("LEZEJ3k1cTQ", "Doraemon", "Episode 42");
		addVideoItem("seqE3MRuCtw", "Doraemon", "Episode 43");
		addVideoItem("6y3UfZTmGwE", "Doraemon", "Episode 44");
		addVideoItem("EQQRAkCSY-k", "Doraemon", "Episode 45");
		addVideoItem("bGT934gb6H4", "Doraemon", "Episode 46");
		addVideoItem("sMNb7Mrbdqw", "Doraemon", "Episode 47");
		addVideoItem("1VazU1GI9sE", "Doraemon", "Episode 48");
		addVideoItem("KV4zhP0FJH8", "Doraemon", "Episode 49");
		addVideoItem("R4Z70iDgfKE", "Doraemon", "Episode 50");
		addVideoItem("YIZRZlQFcqw", "Doraemon", "Episode 51");
		addVideoItem("V3y5seJLIwY", "Doraemon", "Episode 52");
		addVideoItem("1PPfOzQtLfY", "Doraemon", "Episode 53");
		addVideoItem("yO61h-AsdkE", "Doraemon", "Episode 54");
		addVideoItem("bl1Q5SLVsB0", "Doraemon", "Episode 55");
		addVideoItem("UYE_PGCZNG8", "Doraemon", "Episode 56");
		addVideoItem("EhY8dfaNQQU", "Doraemon", "Episode 57");
		addVideoItem("Fbugg6ufQ28", "Doraemon", "Episode 58");
		addVideoItem("CF-QUAsfK1Q", "Doraemon", "Episode 59");
		addVideoItem("4gCQDkUmYxg", "Doraemon", "Episode 60");
		addVideoItem("g3U_8iEUgnc", "Doraemon", "Episode 61");
		addVideoItem("z-fL4FvKtvw", "Doraemon", "Episode 62");
		addVideoItem("cJpCxrhbL_c", "Doraemon", "Episode 63");
		addVideoItem("quVcYr6QOv8", "Doraemon", "Episode 64");
		addVideoItem("m3i32KyfLVM", "Doraemon", "Episode 65");
		addVideoItem("MMn-FyprZA4", "Doraemon", "Episode 66");
		addVideoItem("YEGLSNFyn0A", "Doraemon", "Episode 67");
		addVideoItem("y2FW7dtRo3s", "Doraemon", "Episode 68");
		addVideoItem("Q5dCJME7UXQ", "Doraemon", "Episode 69");
		addVideoItem("RW7uXXS0h6k", "Doraemon", "Episode 70");
		addVideoItem("bKoP6B0_shM", "Doraemon", "Episode 71");
		addVideoItem("G6wXJBJX-po", "Doraemon", "Episode 72");
		addVideoItem("WKXup_ZsIBc", "Doraemon", "Episode 73");
		addVideoItem("2I4o1qfAp7g", "Doraemon", "Episode 74");
		addVideoItem("lAsp8_TMAd8", "Doraemon", "Episode 75");
		addVideoItem("2QpHA2Lgkuw", "Doraemon", "Episode 76");
		addVideoItem("rbDo093oYK0", "Doraemon", "Episode 77");
		addVideoItem("iFsfAMgLh90", "Doraemon", "Episode 78");
		addVideoItem("bKoP6B0_shM", "Doraemon", "Episode 79");
		addVideoItem("y4bjrfF42oU", "Doraemon", "Episode 80");
		addVideoItem("flGbc0er5Ew", "Doraemon", "Episode 81");
		addVideoItem("NxZ0HCMSa8E", "Doraemon", "Episode 82");
		addVideoItem("7U4D1LYaW5w", "Doraemon", "Episode 83");
		addVideoItem("S7Z1NHSa7lI", "Doraemon", "Episode 84");
		addVideoItem("ea-djObFh6I", "Doraemon", "Episode 85");
		addVideoItem("wKSoUbbczpg", "Doraemon", "Episode 86");
		addVideoItem("lhdVvy4AZdc", "Doraemon", "Episode 87");
		addVideoItem("r1HrjuETiyg", "Doraemon", "Episode 88");
		addVideoItem("EovoK_K9lHs", "Doraemon", "Episode 89");
		addVideoItem("pgRve2vfNUg", "Doraemon", "Episode 90");
		addVideoItem("aQiNxCW4oE8", "Doraemon", "Episode 91");
		addVideoItem("gscK-anLMDY", "Doraemon", "Episode 92");
		addVideoItem("3FVVrLsJdws", "Doraemon", "Episode 93");
		addVideoItem("9_hN47tum0I", "Doraemon", "Episode 94");
		addVideoItem("vbnzbkIja6k", "Doraemon", "Episode 95");
		addVideoItem("cx2IJP08akQ", "Doraemon", "Episode 96");
		addVideoItem("XTyXl1hb8ng", "Doraemon", "Episode 97");
		addVideoItem("GXWXenv4E-c", "Doraemon", "Episode 98");
		addVideoItem("XvF0ptg9pJU", "Doraemon", "Episode 99");
		addVideoItem("YCwBQEgK3DE", "Doraemon", "Episode 100");
		createPlayList("Doraemon", R.drawable.doraemon);
		//==========================================================================


		//==========================================================================
		addVideoItem("xfeNhCl3VoI", "Shin Chan", "Episode 01");
		addVideoItem("cSaye6R3_Eg", "Shin Chan", "Episode 02");
		addVideoItem("AcG-KYlbplk", "Shin Chan", "Episode 03");
		addVideoItem("N8Jgb50er1s", "Shin Chan", "Episode 04");
		addVideoItem("3V59B-9XQps", "Shin Chan", "Episode 05");
		addVideoItem("WLbjNMcIly8", "Shin Chan", "Episode 06");
		addVideoItem("P5O0n7d7VkI", "Shin Chan", "Episode 07");
		addVideoItem("SvX4bzdlsZY", "Shin Chan", "Episode 08");
		addVideoItem("qU-SFAkpYd4", "Shin Chan", "Episode 09");
		addVideoItem("fPZAtv4-5Pg", "Shin Chan", "Episode 10");
		addVideoItem("WxSdht7MMGs", "Shin Chan", "Episode 11");
		addVideoItem("EO6LFC9fVfE", "Shin Chan", "Episode 12");
		addVideoItem("_Xm4046pYC0", "Shin Chan", "Episode 13");
		addVideoItem("fYDhnq7IprE", "Shin Chan", "Episode 14");
		addVideoItem("5_0pBhDPV38", "Shin Chan", "Episode 15");
		addVideoItem("yZPrcdjhfdE", "Shin Chan", "Episode 16");
		addVideoItem("NI1ZX-pM-HQ", "Shin Chan", "Episode 17");
		addVideoItem("5Mspxz9Lfpw", "Shin Chan", "Episode 18");
		addVideoItem("_P9tr7UZohc", "Shin Chan", "Episode 19");
		addVideoItem("GNs6034VK2I", "Shin Chan", "Episode 20");
		addVideoItem("dVYfYNBJeMI", "Shin Chan", "Episode 21");
		addVideoItem("oPWEZ6ZYP70", "Shin Chan", "Episode 22");
		addVideoItem("TWB0uaN8omA", "Shin Chan", "Episode 23");
		addVideoItem("WxSdht7MMGs", "Shin Chan", "Episode 24");
		addVideoItem("auct7tTX24U", "Shin Chan", "Episode 25");
		addVideoItem("khVObGxG4Ww", "Shin Chan", "Episode 26");
		addVideoItem("EU2nDOqUOXw", "Shin Chan", "Episode 27");
		addVideoItem("NsgoWWTDRcE", "Shin Chan", "Episode 28");
		addVideoItem("6qLYTyXhDdA", "Shin Chan", "Episode 29");
		addVideoItem("5mwaERVN9gY", "Shin Chan", "Episode 30");
		addVideoItem("cVPXVF4K2vk", "Shin Chan", "Episode 31");
		addVideoItem("LRhcQks4QqU", "Shin Chan", "Episode 32");
		addVideoItem("fPZAtv4-5Pg", "Shin Chan", "Episode 33");
		addVideoItem("NUUtHl6-2Rw", "Shin Chan", "Episode 34");
		addVideoItem("3ViUVk_LEgM", "Shin Chan", "Episode 35");
		addVideoItem("cSaye6R3_Eg", "Shin Chan", "Episode 36");
		addVideoItem("344i3Kov_-o", "Shin Chan", "Episode 37");
		addVideoItem("GyBu_ZOuqv8", "Shin Chan", "Episode 38");
		addVideoItem("zp0O5FJYtMo", "Shin Chan", "Episode 39");
		addVideoItem("6qBo0evu9X0", "Shin Chan", "Episode 40");
		addVideoItem("BbUUYZ5VzCI", "Shin Chan", "Episode 41");
		addVideoItem("OiF6hyQtZRI", "Shin Chan", "Episode 42");
		addVideoItem("OdWKoj937TA", "Shin Chan", "Episode 43");
		addVideoItem("wGZfrHv9Yoc", "Shin Chan", "Episode 44");
		addVideoItem("i64JgR3HqGo", "Shin Chan", "Episode 45");
		addVideoItem("DEcwPwB3AYA", "Shin Chan", "Episode 46");
		addVideoItem("bJAKXV0aJuo", "Shin Chan", "Episode 47");
		addVideoItem("9GzD4ov4Dlo", "Shin Chan", "Episode 48");
		addVideoItem("0mFLSzz_1ZA", "Shin Chan", "Episode 49");
		addVideoItem("K0C5ih0P4c0", "Shin Chan", "Episode 50");
		addVideoItem("izn6b0-mokk", "Shin Chan", "Episode 51");
		addVideoItem("izn6b0-mokk", "Shin Chan", "Episode 52");
		addVideoItem("0-uQO0gAXL4", "Shin Chan", "Episode 53");
		addVideoItem("1mcrNzds6c8", "Shin Chan", "Episode 54");
		addVideoItem("PP14m6PWOwA", "Shin Chan", "Episode 55");
		addVideoItem("_7rz7ud0iWA", "Shin Chan", "Episode 56");
		addVideoItem("QXYdBF5Nv18", "Shin Chan", "Episode 57");
		addVideoItem("tM1QXYFAeC8", "Shin Chan", "Episode 58");
		addVideoItem("bE6ZlPsgEcg", "Shin Chan", "Episode 59");
		addVideoItem("r-NvtbAoayk", "Shin Chan", "Episode 60");
		addVideoItem("Q9_P3pDxH7o", "Shin Chan", "Episode 61");
		addVideoItem("jmr4Q0he55o", "Shin Chan", "Episode 62");
		addVideoItem("7uTfZwUbe0s", "Shin Chan", "Episode 63");
		addVideoItem("OmkdTvOCUDg", "Shin Chan", "Episode 64");
		addVideoItem("Y4s5XR9eMmQ", "Shin Chan", "Episode 65");
		addVideoItem("0qo8QNx1QDQ", "Shin Chan", "Episode 66");
		addVideoItem("-djv6642JP4", "Shin Chan", "Episode 67");
		addVideoItem("HHkHQ-oSxJ8", "Shin Chan", "Episode 68");
		addVideoItem("9dmewpFB6jE", "Shin Chan", "Episode 69");
		addVideoItem("EaZL4FpUmQs", "Shin Chan", "Episode 70");
		addVideoItem("NX5vR27NGpQ", "Shin Chan", "Episode 71");
		addVideoItem("qb9yUyQNlSY", "Shin Chan", "Episode 72");
		addVideoItem("mtWshGlvcrs", "Shin Chan", "Episode 73");
		addVideoItem("GwxucH9vwPk", "Shin Chan", "Episode 74");
		addVideoItem("Il8a3XesM_U", "Shin Chan", "Episode 75");
		addVideoItem("elX0mtNWDrA", "Shin Chan", "Episode 76");
		addVideoItem("CmVRISKlZCY", "Shin Chan", "Episode 77");
		addVideoItem("WDSnXJmz9io", "Shin Chan", "Episode 78");
		addVideoItem("k7GxFAIYfMo", "Shin Chan", "Episode 79");
		addVideoItem("7Lmwhx5skSU", "Shin Chan", "Episode 80");
		addVideoItem("iz8AfJfZsNU", "Shin Chan", "Episode 81");
		addVideoItem("QnjltPKQubg", "Shin Chan", "Episode 82");
		addVideoItem("rt7w6q3gyIo", "Shin Chan", "Episode 83");
		addVideoItem("mAistwM5wd8", "Shin Chan", "Episode 84");
		addVideoItem("84otXZP0OjE", "Shin Chan", "Episode 85");
		addVideoItem("r5gXC-Fg6K4", "Shin Chan", "Episode 86");
		addVideoItem("84otXZP0OjE", "Shin Chan", "Episode 87");
		addVideoItem("dS9KH15clMk", "Shin Chan", "Episode 88");
		addVideoItem("04PRtgUvG_o", "Shin Chan", "Episode 89");
		addVideoItem("ukZq45RNDrA", "Shin Chan", "Episode 90");
		addVideoItem("51hzBDODBw4", "Shin Chan", "Episode 91");
		addVideoItem("2gVABkJaCKQ", "Shin Chan", "Episode 93");
		addVideoItem("jE9Jztclv68", "Shin Chan", "Episode 94");
		addVideoItem("eJWg8AXTqRs", "Shin Chan", "Episode 95");
		addVideoItem("Ovrz5CTbPMg", "Shin Chan", "Episode 96");
		addVideoItem("4GoF_DGAzhM", "Shin Chan", "Episode 97");
		addVideoItem("nJYHQfMGk44", "Shin Chan", "Episode 98");
		addVideoItem("86lwCmrrLBo", "Shin Chan", "Episode 99");
		addVideoItem("4wO7RRAzHjs", "Shin Chan", "Episode 100");
		createPlayList("Shin Chan", R.drawable.sc);
		//==========================================================================


		//==========================================================================
		addVideoItem("b2m0yf_SxD0", "Motu Patlu", "Episode 01");
		addVideoItem("02oqEaPu-bE", "Motu Patlu", "Episode 02");
		addVideoItem("QL1jkO-oZnk", "Motu Patlu", "Episode 03");
		addVideoItem("3O8nxKpHxlE", "Motu Patlu", "Episode 04");
		addVideoItem("UjgzNN5ij6Q", "Motu Patlu", "Episode 05");
		addVideoItem("IC1-nrYqI_Q", "Motu Patlu", "Episode 06");
		addVideoItem("b48JMaWkkL0", "Motu Patlu", "Episode 07");
		addVideoItem("Wqq3p5jlygs", "Motu Patlu", "Episode 08");
		addVideoItem("jcUZJFQuP-U", "Motu Patlu", "Episode 09");
		addVideoItem("aRlnOqOmXQg", "Motu Patlu", "Episode 10");
		addVideoItem("LZrtej0R5Fw", "Motu Patlu", "Episode 11");
		addVideoItem("-gt_7bHmxb0", "Motu Patlu", "Episode 12");
		addVideoItem("fC1qL_ILAdA", "Motu Patlu", "Episode 13");
		addVideoItem("BViV9wr62kc", "Motu Patlu", "Episode 14");
		addVideoItem("hckJpS_vqqk", "Motu Patlu", "Episode 15");
		addVideoItem("ZihJ8Ss-xEY", "Motu Patlu", "Episode 16");
		addVideoItem("bzgo7LCZ54Y", "Motu Patlu", "Episode 17");
		addVideoItem("8iGElhnREzU", "Motu Patlu", "Episode 18");
		addVideoItem("dnXOgMJ19Is", "Motu Patlu", "Episode 19");
		addVideoItem("phCTivovAlQ", "Motu Patlu", "Episode 20");
		addVideoItem("d6ihJGHb8KY", "Motu Patlu", "Episode 21");
		addVideoItem("DcGWCWrKaf4", "Motu Patlu", "Episode 22");
		addVideoItem("JPy0MropTZ0", "Motu Patlu", "Episode 23");
		addVideoItem("VuRSsHV4KH8", "Motu Patlu", "Episode 24");
		addVideoItem("j8_XcplQ354", "Motu Patlu", "Episode 25");
		addVideoItem("WW1QWYsAyr4", "Motu Patlu", "Episode 26");
		addVideoItem("5OASs_RJYgE", "Motu Patlu", "Episode 27");
		addVideoItem("vh9u-UCLxh8", "Motu Patlu", "Episode 28");
		addVideoItem("SyFoTEcGHeQ", "Motu Patlu", "Episode 29");
		addVideoItem("rnXc8KTH25Q", "Motu Patlu", "Episode 30");
		addVideoItem("c85ykFe6-SM", "Motu Patlu", "Episode 31");
		addVideoItem("TzStVsXSoPE", "Motu Patlu", "Episode 32");
		addVideoItem("bR0vvywkfEc", "Motu Patlu", "Episode 33");
		addVideoItem("sxteNjdU3rM", "Motu Patlu", "Episode 34");
		addVideoItem("mGJq5q33-i0", "Motu Patlu", "Episode 35");
		addVideoItem("tJyEOYWdde8", "Motu Patlu", "Episode 36");
		addVideoItem("bafsvBevtwg", "Motu Patlu", "Episode 37");
		addVideoItem("0NJMNt0ftFo", "Motu Patlu", "Episode 38");
		addVideoItem("rBANvdY_vTw", "Motu Patlu", "Episode 39");
		addVideoItem("LbnsGTn6LOY", "Motu Patlu", "Episode 40");
		addVideoItem("4eJDxvU5IGs", "Motu Patlu", "Episode 41");
		addVideoItem("oD5S0pIIcOY", "Motu Patlu", "Episode 42");
		addVideoItem("8f0UwIxCRok", "Motu Patlu", "Episode 43");
		addVideoItem("i_svhp2LTnM", "Motu Patlu", "Episode 44");
		addVideoItem("N0h8cIfK928", "Motu Patlu", "Episode 45");
		addVideoItem("mm_yIbXiod4", "Motu Patlu", "Episode 46");
		addVideoItem("ICe19ZZCHFE", "Motu Patlu", "Episode 47");
		addVideoItem("LqIvfEbJNAw", "Motu Patlu", "Episode 48");
		addVideoItem("0_rTo_Ea46k", "Motu Patlu", "Episode 49");
		addVideoItem("1SqhJwrtV94", "Motu Patlu", "Episode 50");
		addVideoItem("ONXfQVtp8qY", "Motu Patlu", "Episode 51");
		addVideoItem("W7ZYduZ4uQU", "Motu Patlu", "Episode 52");
		addVideoItem("-HbVwqtJKzQ", "Motu Patlu", "Episode 53");
		addVideoItem("IZyXO4yZmj4", "Motu Patlu", "Episode 54");
		addVideoItem("UImMV0cvIeE", "Motu Patlu", "Episode 55");
		addVideoItem("8bi9X6YQ6Iw", "Motu Patlu", "Episode 56");
		addVideoItem("7pxrKKLW8yE", "Motu Patlu", "Episode 57");
		addVideoItem("1SMBD7QDk3U", "Motu Patlu", "Episode 58");
		addVideoItem("OOv2kEjZ_5Q", "Motu Patlu", "Episode 59");
		addVideoItem("zTOnNPiYLZI", "Motu Patlu", "Episode 60");
		addVideoItem("b9XhPEflvP0", "Motu Patlu", "Episode 61");
		addVideoItem("NiXoQ0UbRUE", "Motu Patlu", "Episode 62");
		addVideoItem("oBAc8Ihxhho", "Motu Patlu", "Episode 63");
		addVideoItem("6lxpbrzSwIU", "Motu Patlu", "Episode 64");
		addVideoItem("gzohYsfkF_4", "Motu Patlu", "Episode 65");
		addVideoItem("6imY4O_T9Zk", "Motu Patlu", "Episode 66");
		addVideoItem("Bd96kxYnPE8", "Motu Patlu", "Episode 67");
		addVideoItem("nYATXPnZJUo", "Motu Patlu", "Episode 68");
		addVideoItem("xSw8-Kv59hE", "Motu Patlu", "Episode 69");
		addVideoItem("Co1gQgLLpZU", "Motu Patlu", "Episode 70");
		addVideoItem("isBVYwgtYLE", "Motu Patlu", "Episode 71");
		addVideoItem("en0-wkbbdrk", "Motu Patlu", "Episode 72");
		addVideoItem("en0-wkbbdrk", "Motu Patlu", "Episode 73");
		addVideoItem("5i7m-L2E9J8", "Motu Patlu", "Episode 74");
		addVideoItem("SxOeyNYWuNs", "Motu Patlu", "Episode 75");
		addVideoItem("_Zlylil0_Kk", "Motu Patlu", "Episode 76");
		addVideoItem("K9GqABJpKQ0", "Motu Patlu", "Episode 77");
		addVideoItem("2UYnYscloAY", "Motu Patlu", "Episode 78");
		addVideoItem("aAqw8k45qg4", "Motu Patlu", "Episode 79");
		addVideoItem("xJnUcqbDy0c", "Motu Patlu", "Episode 80");
		addVideoItem("mBEbsG0JyFk", "Motu Patlu", "Episode 81");
		addVideoItem("bR_Z8p3EtCA", "Motu Patlu", "Episode 82");
		addVideoItem("CxWlhLqguf4", "Motu Patlu", "Episode 83");
		addVideoItem("pia5k-_5odU", "Motu Patlu", "Episode 84");
		addVideoItem("fXUxAlJEarM", "Motu Patlu", "Episode 85");
		addVideoItem("3J3zj0BF7bQ", "Motu Patlu", "Episode 86");
		addVideoItem("8oY60jHH9cs", "Motu Patlu", "Episode 87");
		addVideoItem("yIa5lcgActo", "Motu Patlu", "Episode 88");
		addVideoItem("tlQBYt6ZVuU", "Motu Patlu", "Episode 89");
		addVideoItem("It79mKoP3QY", "Motu Patlu", "Episode 90");
		addVideoItem("xs6i-K7Zi_A", "Motu Patlu", "Episode 91");
		addVideoItem("mtg6LPPuKsg", "Motu Patlu", "Episode 92");
		addVideoItem("CB6Dx-qnsoE", "Motu Patlu", "Episode 93");
		addVideoItem("SemhcYNuOGA", "Motu Patlu", "Episode 94");
		addVideoItem("AfJEIWct8io", "Motu Patlu", "Episode 95");
		addVideoItem("QNhTSRIwlFs", "Motu Patlu", "Episode 96");
		addVideoItem("OOr1xD3dSyc", "Motu Patlu", "Episode 97");
		addVideoItem("eWEWA6TlNOI", "Motu Patlu", "Episode 98");
		addVideoItem("WspnAiQCHSg", "Motu Patlu", "Episode 99");
		addVideoItem("p1nUfMrg570", "Motu Patlu", "Episode 100");
		createPlayList("Motu Patlu", R.drawable.mp);
		//==========================================================================

		//==========================================================================
		addVideoItem("t0Q2otsqC4I", "Tom & Jerry", "Episode 01");
		addVideoItem("Lvd7zQtKS74", "Tom & Jerry", "Episode 02");
		addVideoItem("1eZfRmEtcz8", "Tom & Jerry", "Episode 03");
		addVideoItem("n3Nw8MjXWgQ", "Tom & Jerry", "Episode 04");
		addVideoItem("sJJk3maVzvA", "Tom & Jerry", "Episode 05");
		addVideoItem("rilFfbm7j8k", "Tom & Jerry", "Episode 06");
		addVideoItem("wGXUyM0UoVY", "Tom & Jerry", "Episode 07");
		addVideoItem("4iwBNMH1Ni0", "Tom & Jerry", "Episode 08");
		addVideoItem("tKwD-0lFe4c", "Tom & Jerry", "Episode 09");
		addVideoItem("SIJnzoUvR_k", "Tom & Jerry", "Episode 10");
		addVideoItem("W7x_U3lP760", "Tom & Jerry", "Episode 11");
		addVideoItem("cWXDYpiu6F4", "Tom & Jerry", "Episode 12");
		addVideoItem("36kGoAFzcx0", "Tom & Jerry", "Episode 13");
		addVideoItem("LwZWzeLPuXY", "Tom & Jerry", "Episode 14");
		addVideoItem("HS6iOZua7Vk", "Tom & Jerry", "Episode 15");
		addVideoItem("v74vhVyU51I", "Tom & Jerry", "Episode 16");
		addVideoItem("2xmv5PCoogk", "Tom & Jerry", "Episode 17");
		addVideoItem("tMHRYiCT9Os", "Tom & Jerry", "Episode 18");
		addVideoItem("Ln-Oa1OBtlU", "Tom & Jerry", "Episode 19");
		addVideoItem("EqZxXrWJHso", "Tom & Jerry", "Episode 20");
		addVideoItem("_mcDWLwT0MA", "Tom & Jerry", "Episode 21");
		addVideoItem("NACNH5FJRf0", "Tom & Jerry", "Episode 22");
		addVideoItem("AJ7vE64HLac", "Tom & Jerry", "Episode 23");
		addVideoItem("IWc-hotGwcM", "Tom & Jerry", "Episode 24");
		addVideoItem("jLDQ-iTr5hE", "Tom & Jerry", "Episode 25");
		addVideoItem("6O66zJKCV9w", "Tom & Jerry", "Episode 26");
		addVideoItem("AGBjI0x9VbM", "Tom & Jerry", "Episode 27");
		addVideoItem("qeeDhADAU4Q", "Tom & Jerry", "Episode 28");
		addVideoItem("sKVuE9OET_w", "Tom & Jerry", "Episode 29");
		addVideoItem("zMTXDGm5Ygw", "Tom & Jerry", "Episode 30");
		addVideoItem("OjIXzZ25tjA", "Tom & Jerry", "Episode 31");
		addVideoItem("wy2DgqL1P7s", "Tom & Jerry", "Episode 32");
		addVideoItem("cc2j-nFiouQ", "Tom & Jerry", "Episode 33");
		addVideoItem("1rTPX9mj9vU", "Tom & Jerry", "Episode 34");
		addVideoItem("fEhYqOEoU6s", "Tom & Jerry", "Episode 35");
		addVideoItem("5JDAF86rS6M", "Tom & Jerry", "Episode 36");
		addVideoItem("Or-XHvRZFq0", "Tom & Jerry", "Episode 37");
		addVideoItem("EXbW7F7hKNA", "Tom & Jerry", "Episode 38");
		addVideoItem("8EQiSXX-mCE", "Tom & Jerry", "Episode 39");
		addVideoItem("Trdmf2pr_dw", "Tom & Jerry", "Episode 40");
		addVideoItem("CpvpZKO0Lmk", "Tom & Jerry", "Episode 41");
		addVideoItem("wOzzrLPkapQ", "Tom & Jerry", "Episode 42");
		addVideoItem("bCtlituS9p8", "Tom & Jerry", "Episode 43");
		addVideoItem("ZjHs9iJg2E4", "Tom & Jerry", "Episode 44");
		addVideoItem("ibID2NKte5A", "Tom & Jerry", "Episode 45");
		addVideoItem("BOd42fnC2b4", "Tom & Jerry", "Episode 46");
		addVideoItem("7BmNp1n4Y0c", "Tom & Jerry", "Episode 47");
		addVideoItem("Si7DovGBDuQ", "Tom & Jerry", "Episode 48");
		addVideoItem("1-wzu8jhM2Q", "Tom & Jerry", "Episode 49");
		addVideoItem("JqoEluOirws", "Tom & Jerry", "Episode 50");
		addVideoItem("En8v-XcyElE", "Tom & Jerry", "Episode 51");
		addVideoItem("d92vPb426LM", "Tom & Jerry", "Episode 52");
		addVideoItem("hgmth6G8DYg", "Tom & Jerry", "Episode 53");
		addVideoItem("NV_RplzgQyY", "Tom & Jerry", "Episode 54");
		addVideoItem("1SQfx3aMJVo", "Tom & Jerry", "Episode 55");
		addVideoItem("4kdqRqMEPnM", "Tom & Jerry", "Episode 56");
		addVideoItem("sE26JzsCgEQ", "Tom & Jerry", "Episode 57");
		addVideoItem("V0WVbPX0L04", "Tom & Jerry", "Episode 58");
		addVideoItem("w4DIS6Ovhew", "Tom & Jerry", "Episode 59");
		addVideoItem("OSMRaup3FUY", "Tom & Jerry", "Episode 60");
		addVideoItem("ER8a11uRF3M", "Tom & Jerry", "Episode 61");
		addVideoItem("kgYNNiCQlKc", "Tom & Jerry", "Episode 62");
		addVideoItem("0GXIlwmlUZs", "Tom & Jerry", "Episode 63");
		addVideoItem("GvKXGwaytA4", "Tom & Jerry", "Episode 64");
		addVideoItem("rHZUiU36qjc", "Tom & Jerry", "Episode 65");
		addVideoItem("vUDS7HR4wTs", "Tom & Jerry", "Episode 66");
		addVideoItem("Cy4dod6EKjI", "Tom & Jerry", "Episode 67");
		addVideoItem("_bFO8Z1oX_A", "Tom & Jerry", "Episode 68");
		addVideoItem("EZDqGnabo4I", "Tom & Jerry", "Episode 69");
		addVideoItem("qNyGuGRfO4o", "Tom & Jerry", "Episode 70");
		addVideoItem("8DvI1f0IrUE", "Tom & Jerry", "Episode 71");
		addVideoItem("rOIVzM7UWew", "Tom & Jerry", "Episode 72");
		addVideoItem("U0zdHWyZ1sE", "Tom & Jerry", "Episode 73");
		addVideoItem("-wiKuYK0CuM", "Tom & Jerry", "Episode 74");
		addVideoItem("t714DSfMHro", "Tom & Jerry", "Episode 75");
		addVideoItem("8jcKT3tR1LE", "Tom & Jerry", "Episode 76");
		addVideoItem("6eDpjxdiR2s", "Tom & Jerry", "Episode 77");
		addVideoItem("YjqkXN8gt4o", "Tom & Jerry", "Episode 78");
		addVideoItem("SN_uRDxPh4k", "Tom & Jerry", "Episode 79");
		addVideoItem("lH6FI8czrfk", "Tom & Jerry", "Episode 80");
		addVideoItem("ZSOiUL-y9uA", "Tom & Jerry", "Episode 81");
		addVideoItem("PDh4gvb85ww", "Tom & Jerry", "Episode 82");
		addVideoItem("6GxCm7Ih8Qc", "Tom & Jerry", "Episode 83");
		addVideoItem("8UHnorqUTek", "Tom & Jerry", "Episode 84");
		addVideoItem("y9ZwxYgNgj4", "Tom & Jerry", "Episode 85");
		addVideoItem("-vYwiGI5ES4", "Tom & Jerry", "Episode 86");
		addVideoItem("_0LHaFNzD4k", "Tom & Jerry", "Episode 87");
		addVideoItem("hwNx2CYiWmY", "Tom & Jerry", "Episode 88");
		addVideoItem("Tnmj0VT-dys", "Tom & Jerry", "Episode 89");
		addVideoItem("RCGPl1gTKwE", "Tom & Jerry", "Episode 90");
		addVideoItem("RJ6whMQPY6w", "Tom & Jerry", "Episode 91");
		addVideoItem("YMEQwxgyox0", "Tom & Jerry", "Episode 92");
		addVideoItem("W997j05G0qg", "Tom & Jerry", "Episode 93");
		addVideoItem("rDrWZTjd7is", "Tom & Jerry", "Episode 94");
		addVideoItem("VOjvT1irkxk", "Tom & Jerry", "Episode 95");
		addVideoItem("JyFNwGQDFv4", "Tom & Jerry", "Episode 96");
		addVideoItem("5oH9Nr3bKfw", "Tom & Jerry", "Episode 97");
		addVideoItem("tqiIdlVqooc", "Tom & Jerry", "Episode 98");
		addVideoItem("mCHbt6mRrpY", "Tom & Jerry", "Episode 99");
		addVideoItem("YAJCeRGFs0A", "Tom & Jerry", "Episode 100");
		createPlayList("Tom & Jerry", R.drawable.tomjerry);
		//==========================================================================



		/*
		//==========================================================================
		addVideoItem("", "", "");
		addVideoItem("", "", "");
		addVideoItem("", "", "");
		addVideoItem("", "", "");
		createPlayList("Funny Memes", R.drawable.category_4);
		//==========================================================================
		*/









	}

	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>




}


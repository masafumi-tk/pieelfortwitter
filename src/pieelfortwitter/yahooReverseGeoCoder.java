package pieelfortwitter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;


public class yahooReverseGeoCoder {

	public static void setter(Double lat, Double lng) {
		// TODO Auto-generated method stub
		
		try {
						
			URL url = new URL("http://reverse.search.olp.yahooapis.jp/OpenLocalPlatform/V1/reverseGeoCoder?lat="+lat+"&lon="+lng+"&appid=dj0zaiZpPTRITWljcDkzdExTaCZzPWNvbnN1bWVyc2VjcmV0Jng9ZGE-");
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			String strTemp = "";
			
//			while (null != (strTemp = br.readLine())) {
//				strTemp = br.readLine();
//			}
			
			
//			JXPathContext context = JXPathContext.newContext(document);
//			(String)context.getValue("/path/");


//			URLConnection con = url.openConnection();
//			InputStream is = new InputStream();
//			
//			//DOMを使�?ためのインスタンス取�?
//			Document document= DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(
//
//			//root要�?取�?
//			Element elementRoot = document.getDocumentElement();
//
//			//count要�?取�?
//			Element elementCount = (Element) elementRoot.getElementsByTagName("count").item(0);
//			String count = elementCount.getFirstChild().getNodeValue();
//			//System.out.println("count"+count);
//
//			//itemsリスト取�?
//			NodeList localNodeList =
//			 ((Element) elementRoot.getElementsByTagName("Items").item(0)).getElementsByTagName("Item");
//
//			//itemName取�?
//			for (int i = 0; i < localNodeList.getLength(); i++) {
//			 Element elementItem = (Element) localNodeList.item(i);
//			 Element elementItemName = (Element) elementItem.getElementsByTagName("itemName").item(0);
//			 String itemName = elementItemName.getFirstChild().getNodeValue();
//			 //System.out.println("itemName"+itemName);
//			}
			
			while (null != (strTemp = br.readLine())) {
				System.out.println(strTemp);
			}
			System.out.println(strTemp);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

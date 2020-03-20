package com.example.menuairtoday.XMLParser;

import android.util.Xml;

import com.example.menuairtoday.javaBean.Dato;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class XMLPullParserDatos {

    private URL url;

    public XMLPullParserDatos(String url) {

        try {
            this.url = new URL(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Dato> parser() {

        ArrayList<Dato> listaDatos = new ArrayList<Dato>();

        XmlPullParser parser = Xml.newPullParser();

        InputStream is = null;

        try {
            is = url.openConnection().getInputStream();

            parser.setInput(is, null);

            int tipoEvento = parser.getEventType();

            String etiqueta;
            Dato dato = new Dato();
            while (tipoEvento != XmlPullParser.END_DOCUMENT) {

                switch (tipoEvento) {

                    case XmlPullParser.START_DOCUMENT:
                        tipoEvento = parser.next();
                        break;

                    case XmlPullParser.START_TAG:
                        etiqueta = parser.getName();

                        if (etiqueta.equals("Datos xmlns=http://bdca xmlns:xsi=http://www.w3.org/2001/XMLSchema-instance")) {

                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("Dato_Horario")) {

                            dato = new Dato();
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("provincia")) {

                            dato.setProvincia(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("municipio")) {

                            dato.setMunicipio(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("estacion")) {

                            dato.setEstacion(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("magnitud")) {

                            dato.setMagnitud(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("punto_muestreo")) {

                            dato.setPuntoMuestreo(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("ano")) {

                            dato.setAno(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("mes")) {

                            dato.setMes(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("dia")) {

                            dato.setDia(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("H01")) {

                            dato.setH01(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("V01")) {

                            dato.setV01(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("H02")) {

                            dato.setH02(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("V02")) {

                            dato.setV02(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("H03")) {

                            dato.setH03(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("V03")) {

                            dato.setV03(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("H04")) {

                            dato.setH04(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("V04")) {

                            dato.setV04(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("H05")) {

                            dato.setH05(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("V05")) {

                            dato.setV05(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("H06")) {

                            dato.setH06(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("V06")) {

                            dato.setV06(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("H07")) {

                            dato.setH07(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("V07")) {

                            dato.setV07(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("H08")) {

                            dato.setH08(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("V08")) {

                            dato.setV08(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("H09")) {

                            dato.setH09(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("V09")) {

                            dato.setV09(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("H10")) {

                            dato.setH10(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("V10")) {

                            dato.setV10(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("H11")) {

                            dato.setH11(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("V11")) {

                            dato.setV11(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("H12")) {

                            dato.setH12(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("V12")) {

                            dato.setV12(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("H13")) {

                            dato.setH13(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("V13")) {

                            dato.setV13(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("H14")) {

                            dato.setH14(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("V14")) {

                            dato.setV14(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("H15")) {

                            dato.setH15(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("V16")) {

                            dato.setV16(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("H17")) {

                            dato.setH17(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("V17")) {

                            dato.setV17(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("H18")) {

                            dato.setH18(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("V18")) {

                            dato.setV18(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("H19")) {

                            dato.setH19(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("V19")) {

                            dato.setV19(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("H20")) {

                            dato.setH20(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("V20")) {

                            dato.setV20(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("H21")) {

                            dato.setH21(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("V21")) {

                            dato.setV21(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("H22")) {

                            dato.setH22(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("V22")) {

                            dato.setV22(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("H23")) {

                            dato.setH23(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("V23")) {

                            dato.setV23(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("H24")) {

                            dato.setH24(parser.nextText());
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("V24")) {

                            dato.setV24(parser.nextText());
                            tipoEvento = parser.nextTag();

                        }

                        break;

                    case XmlPullParser.END_TAG:

                        etiqueta = parser.getName();

                        if (etiqueta.equals("Dato_Horario")) {

                            listaDatos.add(dato);
                            tipoEvento = parser.nextTag();

                        } else if (etiqueta.equals("Datos")) {

                            // si la etiqueta es CATALOG forzamos el final del documento para finalizar con el parseo
                            tipoEvento = XmlPullParser.END_DOCUMENT;

                        }

                        break;

                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }

        return listaDatos;
    }

}

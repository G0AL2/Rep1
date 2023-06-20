package com.fyber.inneractive.sdk.util;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: classes2.dex */
public class x0 {
    public static Integer a(Node node, String str) {
        String b10 = b(node, str);
        if (TextUtils.isEmpty(b10)) {
            return null;
        }
        try {
            return Integer.valueOf(b10);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String b(Node node, String str) {
        Node namedItem;
        if (node == null || str == null || (namedItem = node.getAttributes().getNamedItem(str)) == null) {
            return null;
        }
        return namedItem.getNodeValue();
    }

    public static List<Node> c(Node node, String str) {
        ArrayList arrayList = new ArrayList();
        if (node != null) {
            NodeList childNodes = node.getChildNodes();
            for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
                Node item = childNodes.item(i10);
                if (item.getNodeName().equals(str)) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }

    public static Node d(Node node, String str) {
        if (node == null) {
            return null;
        }
        NodeList childNodes = node.getChildNodes();
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node item = childNodes.item(i10);
            if (item.getNodeName().equals(str)) {
                return item;
            }
        }
        return null;
    }

    public static String a(Node node) {
        if (node == null || node.getFirstChild() == null || node.getFirstChild().getNodeValue() == null) {
            return null;
        }
        return node.getFirstChild().getNodeValue().trim();
    }
}

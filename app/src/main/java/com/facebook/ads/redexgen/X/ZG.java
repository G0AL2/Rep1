package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class ZG implements AnonymousClass72<String> {
    public static byte[] A01;
    public static String[] A02 = {"a0vPx9r", "g6urVoqpDzgarLiHPisYP6lg0a1Qsxi7", "0D95gUzv3ykjkUAaNmvS0PMqJMmLe", "FmsqkIGDIxf1pyhk8KrqJDmLtRXh", "VdLzyHL", "Y0U6bkGUHGFfKGq4XniOfCVYQx4Des4Z", "CuvTUYqsdTaVr4XM9Y5z36A2N9cPvqqS", "uyYe2wlLl6RVS9ukoAhHAdIguTPHvaGb"};
    public final Map<String, String> A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{96, -74, 116, 35, -29};
    }

    static {
        A03();
    }

    public ZG(Enumeration<InetAddress> enumeration) {
        this.A00 = A01(enumeration);
    }

    public /* synthetic */ ZG(Enumeration enumeration, ZH zh) {
        this(enumeration);
    }

    public static Map<String, String> A01(Enumeration<InetAddress> enumeration) {
        String A00;
        HashMap hashMap = new HashMap();
        while (enumeration.hasMoreElements()) {
            InetAddress nextElement = enumeration.nextElement();
            if (!(nextElement instanceof Inet4Address)) {
                boolean z10 = nextElement instanceof Inet6Address;
                if (A02[5].charAt(2) == 'I') {
                    throw new RuntimeException();
                }
                String[] strArr = A02;
                strArr[0] = "Gz9fwzC";
                strArr[4] = "ybYvLhq";
                if (!z10) {
                    continue;
                }
            }
            String hostAddress = nextElement.getHostAddress();
            if (!(nextElement instanceof Inet4Address)) {
                String address = A02[2];
                if (address.length() != 29) {
                    throw new RuntimeException();
                }
                A02[5] = "FRlIOdImLcKdb9WRfG0MH6oacSxD1nRF";
                A00 = A00(3, 2, 120);
            } else if (A02[6].charAt(24) != 'i') {
                String[] strArr2 = A02;
                strArr2[1] = "2FnSkM3RXE8ViMwKPYtNPOmsjhf021fL";
                strArr2[7] = "CXfbTdSUzlrlHA9c2DxJWpFugzDpw8Hh";
                A00 = A00(1, 2, 11);
            } else {
                A00 = A00(1, 2, 11);
            }
            String address2 = A00(0, 1, 6);
            boolean contains = hostAddress.contains(address2);
            String[] strArr3 = A02;
            if (strArr3[1].charAt(27) == strArr3[7].charAt(27)) {
                throw new RuntimeException();
            }
            A02[5] = "trbotCFTtTb6ytC4d3Dugjdfr0hOKtvS";
            if (contains) {
                hostAddress = hostAddress.substring(0, hostAddress.indexOf(37));
            }
            hashMap.put(A00, hostAddress);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass72
    /* renamed from: A02 */
    public final JSONObject AFB(String str, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        boolean z10 = false;
        for (Map.Entry<String, String> entry : this.A00.entrySet()) {
            if (entry.getKey() != null && !entry.getKey().isEmpty() && entry.getValue() != null && !entry.getValue().isEmpty()) {
                z10 = true;
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
        }
        if (z10) {
            return jSONObject.put(str, jSONObject2);
        }
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass72
    public final boolean A8S(Object obj) {
        ZG zg = (ZG) obj;
        Map<String, String> map = this.A00;
        if (map != null) {
            Map<String, String> map2 = zg.A00;
            if (A02[3].length() == 23) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[0] = "yfFtf6a";
            strArr[4] = "R3xveNN";
            if (map2 != null) {
                if (map.size() != zg.A00.size()) {
                    return false;
                }
                Iterator<Map.Entry<String, String>> it = this.A00.entrySet().iterator();
                Iterator<Map.Entry<String, String>> newInetAddressIterator = zg.A00.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, String> next = it.next();
                    Map.Entry<String, String> next2 = newInetAddressIterator.next();
                    if (next == null || next2 == null) {
                        return next == null && next2 == null;
                    } else if (next.getKey() != null && !next.getKey().equals(next2.getKey())) {
                        return false;
                    } else {
                        if (next.getValue() != null && !next.getValue().equals(next2.getValue())) {
                            return false;
                        }
                    }
                }
                return true;
            }
        }
        return this.A00 == null && zg.A00 == null;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass72
    @SuppressLint({"BadMethodUse-java.lang.String.length"})
    public final int AEp() {
        int i10 = 0;
        for (Map.Entry<String, String> entry : this.A00.entrySet()) {
            int length = entry.getKey().length();
            String value = entry.getValue();
            if (A02[6].charAt(24) == 'i') {
                throw new RuntimeException();
            }
            A02[3] = "05271w6tHpnBYDqabX5nc55hVF5X";
            i10 += length + value.length();
        }
        return i10;
    }
}

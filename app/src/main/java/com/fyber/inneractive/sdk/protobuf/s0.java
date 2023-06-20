package com.fyber.inneractive.sdk.protobuf;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class s0 {
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01d1, code lost:
        if (((java.lang.Integer) r4).intValue() == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01e2, code lost:
        if (((java.lang.Float) r4).floatValue() == 0.0f) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f4, code lost:
        if (((java.lang.Double) r4).doubleValue() == 0.0d) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0228, code lost:
        r6 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(com.fyber.inneractive.sdk.protobuf.q0 r13, java.lang.StringBuilder r14, int r15) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.s0.a(com.fyber.inneractive.sdk.protobuf.q0, java.lang.StringBuilder, int):void");
    }

    public static final void a(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                a(sb2, i10, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                a(sb2, i10, str, entry);
            }
        } else {
            sb2.append('\n');
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                sb2.append(' ');
            }
            sb2.append(str);
            if (obj instanceof String) {
                sb2.append(": \"");
                sb2.append(k1.a(i.a((String) obj)));
                sb2.append('\"');
            } else if (obj instanceof i) {
                sb2.append(": \"");
                sb2.append(k1.a((i) obj));
                sb2.append('\"');
            } else if (obj instanceof GeneratedMessageLite) {
                sb2.append(" {");
                a((GeneratedMessageLite) obj, sb2, i10 + 2);
                sb2.append("\n");
                while (i11 < i10) {
                    sb2.append(' ');
                    i11++;
                }
                sb2.append("}");
            } else if (obj instanceof Map.Entry) {
                sb2.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i13 = i10 + 2;
                a(sb2, i13, "key", entry2.getKey());
                a(sb2, i13, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry2.getValue());
                sb2.append("\n");
                while (i11 < i10) {
                    sb2.append(' ');
                    i11++;
                }
                sb2.append("}");
            } else {
                sb2.append(": ");
                sb2.append(obj.toString());
            }
        }
    }

    public static final String a(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }
}

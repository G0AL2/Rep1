package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.VisibleForTesting;
import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import javax.annotation.Nullable;
import org.json.JSONObject;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: assets/audience_network.dex */
public final class SF {
    public static byte[] A02;
    public static String[] A03 = {"VT4fMDut957REDv81Zf67ZRXVgx5T5a8", "r", "Z8Owoyb", "FnQ4OiwpcdZoDsiJ2m5WJ2Um26YCJsc9", "WRxJAxd2kL6ougEGyIG1Du6QramXeho", "YseYEaNGGUDDQ4eQqZOUPTvdjgKCIPcf", "c4hktFWkJWdy9he8EQ0DeAgF43U5wP0s", "DRA64HFd"};
    @VisibleForTesting
    public BlockingDeque<SG> A00 = new LinkedBlockingDeque();
    @Nullable
    public final String A01;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 104);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A02 = new byte[]{92, 95, 94, 89, 88, 91, 90, 85, 84, 87, 86, 81, 80, 83, 82, 77, 76, 79, 78, 73, 72, 75, 74, 69, 68, 71, 124, Byte.MAX_VALUE, 126, 121, 120, 123, 122, 117, 116, 119, 118, 113, 112, 115, 114, 109, 108, 111, 110, 105, 104, 107, 106, 101, 100, 103, 45, 44, 47, 46, 41, 40, 43, 42, 37, 36, 54, 50, 48, 51, 33, 55, 22, 55, 62, 38, 51, 45, 123, 42, 13, 57, 40, 37, 35, 57, 49, 28, 6, 38, 26, 0, 27, 17, 58, 27, 10, 25, 14, 15, 21, 19, 18, 109, 52, 115, 100, 100, 52, 44, 52, 69, 95, 76, 83, 73, 83, 78, 85, 83, 83, 82, 73, 91, 87, 78, 73, 85, 87, 70, 52, 107};
    }

    static {
        A07();
    }

    public SF(@Nullable String str) {
        this.A01 = str;
    }

    public static long A00(long j10) {
        return (j10 << 1) ^ (j10 >> 63);
    }

    /* JADX WARN: Incorrect condition in loop: B:26:0x00d9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long A01(java.util.List<com.facebook.ads.redexgen.X.SG> r9) {
        /*
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r3 = 1
        L6:
            int r0 = r9.size()
            if (r3 >= r0) goto La5
            java.lang.Object r0 = r9.get(r3)
            com.facebook.ads.redexgen.X.SG r0 = (com.facebook.ads.redexgen.X.SG) r0
            long r7 = r0.A03()
            java.lang.Object r0 = r9.get(r3)
            com.facebook.ads.redexgen.X.SG r0 = (com.facebook.ads.redexgen.X.SG) r0
            long r4 = r0.A01()
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            boolean r0 = r6.containsKey(r0)
            r2 = 1
            if (r0 == 0) goto L99
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            java.lang.Object r0 = r6.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r0 = r0 + r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.put(r1, r0)
        L45:
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            boolean r0 = r6.containsKey(r0)
            if (r0 == 0) goto L6c
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            java.lang.Object r0 = r6.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r0 = r0 + r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.put(r1, r0)
        L69:
            int r3 = r3 + 1
            goto L6
        L6c:
            java.lang.Long r5 = java.lang.Long.valueOf(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.SF.A03
            r0 = 6
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 27
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L8e
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L8e:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.SF.A03
            java.lang.String r1 = "bvHx6KIUVUv7zPzX2p7QZTtdwWrhQsKz"
            r0 = 5
            r2[r0] = r1
            r6.put(r5, r4)
            goto L69
        L99:
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r6.put(r1, r0)
            goto L45
        La5:
            r4 = 3333(0xd05, double:1.6467E-320)
            r3 = 0
            java.util.Set r0 = r6.entrySet()
            java.util.Iterator r2 = r0.iterator()
        Lb0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Ld4
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r1.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r3 >= r0) goto Lb0
            r3 = r0
            java.lang.Object r0 = r1.getKey()
            java.lang.Long r0 = (java.lang.Long) r0
            long r4 = r0.longValue()
            goto Lb0
        Ld4:
            r3 = 1
        Ld5:
            int r0 = r9.size()
            if (r3 >= r0) goto L106
            java.lang.Object r2 = r9.get(r3)
            com.facebook.ads.redexgen.X.SG r2 = (com.facebook.ads.redexgen.X.SG) r2
            java.lang.Object r0 = r9.get(r3)
            com.facebook.ads.redexgen.X.SG r0 = (com.facebook.ads.redexgen.X.SG) r0
            long r0 = r0.A03()
            long r0 = r0 - r4
            r2.A08(r0)
            java.lang.Object r2 = r9.get(r3)
            com.facebook.ads.redexgen.X.SG r2 = (com.facebook.ads.redexgen.X.SG) r2
            java.lang.Object r0 = r9.get(r3)
            com.facebook.ads.redexgen.X.SG r0 = (com.facebook.ads.redexgen.X.SG) r0
            long r0 = r0.A01()
            long r0 = r0 - r4
            r2.A06(r0)
            int r3 = r3 + 1
            goto Ld5
        L106:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.SF.A01(java.util.List):long");
    }

    @SuppressLint({"BadMethodUse-java.lang.String.charAt"})
    public static String A03(String base64chars) {
        String A022 = A02(0, 64, 117);
        StringBuilder sb2 = new StringBuilder(base64chars);
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        int length = sb2.length() % 3;
        if (length > 0) {
            while (length < 3) {
                String[] strArr = A03;
                if (strArr[6].charAt(27) != strArr[0].charAt(27)) {
                    throw new RuntimeException();
                }
                A03[2] = "LfiGB0y4";
                sb4.append('=');
                sb2.append((char) 0);
                length++;
            }
        }
        for (int n42 = 0; n42 < sb2.length(); n42 += 3) {
            int charAt = (sb2.charAt(n42) << 16) + (sb2.charAt(n42 + 1) << '\b') + sb2.charAt(n42 + 2);
            int n32 = (charAt >> 18) & 63;
            sb3.append(A022.charAt(n32));
            sb3.append(A022.charAt((charAt >> 12) & 63));
            sb3.append(A022.charAt((charAt >> 6) & 63));
            sb3.append(A022.charAt(charAt & 63));
        }
        return sb3.substring(0, sb3.length() - sb4.length()) + ((Object) sb4);
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x0065 */
    @javax.annotation.Nullable
    @android.annotation.SuppressLint({"BadMethodUse-java.lang.String.length"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A04(@javax.annotation.Nullable java.util.List<com.facebook.ads.redexgen.X.SG> r10) {
        /*
            if (r10 == 0) goto L8
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto La
        L8:
            r0 = 0
            return r0
        La:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r0 = 0
            java.lang.Object r0 = r10.get(r0)
            com.facebook.ads.redexgen.X.SG r0 = (com.facebook.ads.redexgen.X.SG) r0
            java.util.List r3 = r0.A04()
            r2 = 73
            r1 = 2
            r0 = 35
            java.lang.String r0 = A02(r2, r1, r0)
            r4.put(r0, r3)
            r5 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r2 = 92
            r1 = 7
            r0 = 20
            java.lang.String r0 = A02(r2, r1, r0)
            r4.put(r0, r3)
            r9 = 0
            int r0 = r10.size()
            if (r0 <= r5) goto Lf0
            A09(r10)
            long r0 = A01(r10)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            r2 = 64
            r1 = 9
            r0 = 58
            java.lang.String r0 = A02(r2, r1, r0)
            r4.put(r0, r3)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r3 = 1
        L61:
            int r0 = r10.size()
            if (r3 >= r0) goto Lbf
            java.lang.Object r0 = r10.get(r3)
            com.facebook.ads.redexgen.X.SG r0 = (com.facebook.ads.redexgen.X.SG) r0
            long r0 = r0.A03()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.add(r0)
            java.lang.Object r0 = r10.get(r3)
            com.facebook.ads.redexgen.X.SG r0 = (com.facebook.ads.redexgen.X.SG) r0
            long r0 = r0.A01()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.add(r0)
            java.lang.Object r0 = r10.get(r3)
            com.facebook.ads.redexgen.X.SG r0 = (com.facebook.ads.redexgen.X.SG) r0
            long r0 = r0.A02()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.add(r0)
            java.lang.Object r0 = r10.get(r3)
            com.facebook.ads.redexgen.X.SG r0 = (com.facebook.ads.redexgen.X.SG) r0
            long r0 = r0.A00()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7.add(r0)
            java.lang.Object r0 = r10.get(r3)
            com.facebook.ads.redexgen.X.SG r0 = (com.facebook.ads.redexgen.X.SG) r0
            long r5 = r0.A00()
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto Lbc
            r9 = 1
        Lbc:
            int r3 = r3 + 1
            goto L61
        Lbf:
            java.lang.String r3 = A05(r8)
            r2 = 81
            r1 = 2
            r0 = 55
            java.lang.String r0 = A02(r2, r1, r0)
            r4.put(r0, r3)
            java.lang.String r3 = A05(r7)
            r2 = 75
            r1 = 6
            r0 = 36
            java.lang.String r0 = A02(r2, r1, r0)
            r4.put(r0, r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r9)
            r2 = 83
            r1 = 9
            r0 = 29
            java.lang.String r0 = A02(r2, r1, r0)
            r4.put(r0, r3)
        Lf0:
            java.lang.String r2 = A06(r4)
            int r1 = r2.length()
            r0 = 900000(0xdbba0, float:1.261169E-39)
            if (r1 <= r0) goto L108
            r2 = 99
            r1 = 29
            r0 = 126(0x7e, float:1.77E-43)
            java.lang.String r0 = A02(r2, r1, r0)
            return r0
        L108:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.SF.A04(java.util.List):java.lang.String");
    }

    public static String A05(List<Long> list) {
        StringBuilder sb2 = new StringBuilder();
        for (Long l10 : list) {
            A08(sb2, A00(l10.longValue()));
        }
        return A03(sb2.toString());
    }

    public static String A06(Map<String, Object> map) {
        return new JSONObject(map).toString();
    }

    public static void A08(StringBuilder sb2, long j10) {
        while (j10 >= 128) {
            j10 >>= 7;
            sb2.append((char) (((128 - 1) & j10) | 128));
        }
        char c10 = (char) j10;
        String[] strArr = A03;
        if (strArr[6].charAt(27) != strArr[0].charAt(27)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[6] = "TgLp8xzira9J3G7G7T0jqPUigov5tglm";
        strArr2[0] = "pcTwByMvDCDs4QWUJjAKPoIFXFV5AKB6";
        sb2.append(c10);
    }

    public static void A09(List<SG> list) {
        long A00;
        for (int size = list.size() - 1; size > 0; size--) {
            list.get(size).A08(list.get(size).A03() - list.get(size - 1).A03());
            list.get(size).A06(list.get(size).A01() - list.get(size - 1).A01());
            list.get(size).A07(list.get(size).A02() - list.get(size - 1).A02());
            SG sg = list.get(size);
            if (list.get(size - 1).A00() == -1) {
                A00 = 0;
            } else {
                A00 = list.get(size).A00() - list.get(size - 1).A00();
            }
            sg.A05(A00);
            list.get(size).A07(list.get(size).A02() - list.get(size).A01());
        }
    }

    public final List<SG> A0A() {
        ArrayList arrayList = new ArrayList();
        this.A00.drainTo(arrayList);
        return arrayList;
    }

    public final void A0B(SG sg) {
        SG peekLast = this.A00.peekLast();
        if (peekLast != null) {
            long A032 = peekLast.A03();
            if (A03[7].length() == 7) {
                throw new RuntimeException();
            }
            A03[1] = "fQhMIvl";
            if (A032 == sg.A03() && peekLast.A01() == sg.A01()) {
                return;
            }
        }
        this.A00.add(sg);
    }
}

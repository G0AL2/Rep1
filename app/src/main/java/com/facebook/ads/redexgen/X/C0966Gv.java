package com.facebook.ads.redexgen.X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: com.facebook.ads.redexgen.X.Gv  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0966Gv {
    public static byte[] A0B;
    public static String[] A0C = {"tlVw39Ohl0PVI8fV0YPCcQegL80HNmMX", "3PVmbccCk3TYNa4naZfa0", "qupmPShVTMJhVfYkOYpITScBpcljJSOb", "vJlbAlf6aMAaV2lo2oeuySGVP617mKUN", "wib00gU5k9UeC7KFMR3e95wgyYt7DknS", "DUfNRVSmHsUyVjEYzj4oHSrvl1jpEWvG", "VaOanHTtNfMSjEnVOScoKyOAyIQNDQyO", "uu1yNZ48dLzKD2dAjoiHYwXYoxLcRzCz"};
    public List<C0966Gv> A00;
    public final long A01;
    public final long A02;
    public final H1 A03;
    public final String A04;
    @Nullable
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final HashMap<String, Integer> A08;
    public final HashMap<String, Integer> A09;
    public final String[] A0A;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 56);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        byte[] bArr = {54, 38, 101, 109, 124, 105, 108, 105, 124, 105, 46};
        if (A0C[4].charAt(11) == 'K') {
            throw new RuntimeException();
        }
        A0C[1] = "AmdkI9Q8sE";
        A0B = bArr;
    }

    static {
        A07();
    }

    public C0966Gv(@Nullable String str, String str2, long j10, long j11, H1 h12, String[] strArr, String str3) {
        this.A05 = str;
        this.A06 = str2;
        this.A03 = h12;
        this.A0A = strArr;
        this.A07 = str2 != null;
        this.A02 = j10;
        this.A01 = j11;
        this.A04 = (String) IK.A01(str3);
        this.A09 = new HashMap<>();
        this.A08 = new HashMap<>();
    }

    private final int A00() {
        List<C0966Gv> list = this.A00;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    private SpannableStringBuilder A01(SpannableStringBuilder spannableStringBuilder) {
        int spacesToDelete = spannableStringBuilder.length();
        for (int j10 = 0; j10 < spacesToDelete; j10++) {
            if (spannableStringBuilder.charAt(j10) == ' ') {
                int i10 = j10 + 1;
                while (i10 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i10) == ' ') {
                    i10++;
                }
                int i11 = i10 - (j10 + 1);
                if (i11 > 0) {
                    spannableStringBuilder.delete(j10, j10 + i11);
                    spacesToDelete -= i11;
                }
            }
        }
        if (spacesToDelete > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
            spacesToDelete--;
        }
        for (int i12 = 0; i12 < spacesToDelete - 1; i12++) {
            if (spannableStringBuilder.charAt(i12) == '\n' && spannableStringBuilder.charAt(i12 + 1) == ' ') {
                spannableStringBuilder.delete(i12 + 1, i12 + 2);
                spacesToDelete--;
            }
        }
        if (spacesToDelete > 0 && spannableStringBuilder.charAt(spacesToDelete - 1) == ' ') {
            spannableStringBuilder.delete(spacesToDelete - 1, spacesToDelete);
            if (A0C[4].charAt(11) == 'K') {
                throw new RuntimeException();
            }
            A0C[7] = "6UN1wY1Jt9AyUvakQ5bJnJbUcnBDq6Nx";
            spacesToDelete--;
        }
        for (int i13 = 0; i13 < spacesToDelete - 1; i13++) {
            if (spannableStringBuilder.charAt(i13) == ' ' && spannableStringBuilder.charAt(i13 + 1) == '\n') {
                spannableStringBuilder.delete(i13, i13 + 1);
                spacesToDelete--;
            }
        }
        if (spacesToDelete > 0 && spannableStringBuilder.charAt(spacesToDelete - 1) == '\n') {
            spannableStringBuilder.delete(spacesToDelete - 1, spacesToDelete);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder A02(String str, Map<String, SpannableStringBuilder> map) {
        if (!map.containsKey(str)) {
            map.put(str, new SpannableStringBuilder());
        }
        SpannableStringBuilder spannableStringBuilder = map.get(str);
        String[] strArr = A0C;
        if (strArr[3].charAt(21) != strArr[2].charAt(21)) {
            throw new RuntimeException();
        }
        A0C[7] = "hg6ickUmYbVaq8iUWn6QMVEg4prIKgzg";
        return spannableStringBuilder;
    }

    private final C0966Gv A03(int i10) {
        List<C0966Gv> list = this.A00;
        if (list != null) {
            return list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public static C0966Gv A04(String str) {
        return new C0966Gv(null, C0968Gx.A02(str), -9223372036854775807L, -9223372036854775807L, null, null, A06(0, 0, 104));
    }

    public static C0966Gv A05(String str, long j10, long j11, H1 h12, String[] strArr, String str2) {
        return new C0966Gv(str, null, j10, j11, h12, strArr, str2);
    }

    private void A08(long j10, Map<String, H1> map, Map<String, SpannableStringBuilder> map2) {
        if (!A0C(j10)) {
            return;
        }
        for (Map.Entry<String, Integer> entry : this.A08.entrySet()) {
            String key = entry.getKey();
            int intValue = this.A09.containsKey(key) ? this.A09.get(key).intValue() : 0;
            int intValue2 = entry.getValue().intValue();
            if (intValue != intValue2) {
                SpannableStringBuilder regionOutput = map2.get(key);
                A0A(map, regionOutput, intValue, intValue2);
            }
        }
        for (int i10 = 0; i10 < A00(); i10++) {
            A03(i10).A08(j10, map, map2);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:39:0x00f8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A09(long r10, boolean r12, java.lang.String r13, java.util.Map<java.lang.String, android.text.SpannableStringBuilder> r14) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0966Gv.A09(long, boolean, java.lang.String, java.util.Map):void");
    }

    private void A0A(Map<String, H1> map, SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
        H1 A00 = C0968Gx.A00(this.A03, this.A0A, map);
        if (A00 != null) {
            C0968Gx.A05(spannableStringBuilder, i10, i11, A00);
        }
    }

    private void A0B(TreeSet<Long> treeSet, boolean z10) {
        boolean equals = A06(10, 1, 102).equals(this.A05);
        if (z10 || equals) {
            long j10 = this.A02;
            if (A0C[1].length() == 9) {
                throw new RuntimeException();
            }
            A0C[1] = "LOAziX4ZrknWSY3Fjl";
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.A01;
            if (j11 != -9223372036854775807L) {
                Long valueOf = Long.valueOf(j11);
                if (A0C[0].charAt(29) != 'm') {
                    throw new RuntimeException();
                }
                A0C[1] = "dzTKJn1Q9f1wWrnlDp9SVW8wMEk";
                treeSet.add(valueOf);
            }
        }
        if (this.A00 == null) {
            return;
        }
        for (int i10 = 0; i10 < this.A00.size(); i10++) {
            this.A00.get(i10).A0B(treeSet, z10 || equals);
        }
    }

    private final boolean A0C(long j10) {
        return (this.A02 == -9223372036854775807L && this.A01 == -9223372036854775807L) || (this.A02 <= j10 && this.A01 == -9223372036854775807L) || ((this.A02 == -9223372036854775807L && j10 < this.A01) || (this.A02 <= j10 && j10 < this.A01));
    }

    public final List<GX> A0D(long j10, Map<String, H1> map, Map<String, C0967Gw> map2) {
        TreeMap<String, SpannableStringBuilder> regionOutputs = new TreeMap<>();
        A09(j10, false, this.A04, regionOutputs);
        A08(j10, map, regionOutputs);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, SpannableStringBuilder> entry : regionOutputs.entrySet()) {
            C0967Gw c0967Gw = map2.get(entry.getKey());
            arrayList.add(new GX(A01(entry.getValue()), (Layout.Alignment) null, c0967Gw.A00, c0967Gw.A05, c0967Gw.A04, c0967Gw.A01, (int) RecyclerView.UNDEFINED_DURATION, c0967Gw.A03, c0967Gw.A06, c0967Gw.A02));
        }
        return arrayList;
    }

    public final void A0E(C0966Gv c0966Gv) {
        if (this.A00 == null) {
            this.A00 = new ArrayList();
        }
        this.A00.add(c0966Gv);
    }

    public final long[] A0F() {
        TreeSet<Long> treeSet = new TreeSet<>();
        A0B(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        int i10 = 0;
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            int i11 = i10 + 1;
            jArr[i10] = it.next().longValue();
            i10 = i11;
        }
        return jArr;
    }
}

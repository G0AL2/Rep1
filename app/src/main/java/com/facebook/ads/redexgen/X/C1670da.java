package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.da  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1670da implements InterfaceC05740i, InterfaceC05780n {
    public static byte[] A0A;
    public static String[] A0B = {"OTBhn", "woE0GsYsDC", "jJJsRhZ6eh", "RbmDZKGZyk", "MbYnCV2deeCvNEpfUSPgn7RvJuamywdV", "va4Mi1JJiq4w08mNkhVxy34L1bzftr4W", "QQZqW8pW387BdDH3gcXSwYVoWAeaIxNz", "E72k8"};
    public static final String A0C;
    public int A00;
    public AnonymousClass11 A01;
    @Nullable
    public AnonymousClass12 A02;
    @Nullable
    public K4 A03;
    @Nullable
    public List<UB> A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final C1400Xy A09;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 106);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0A = new byte[]{124, 89, 92, 77, 73, 88, 79, 29, 92, 81, 79, 88, 92, 89, 68, 29, 81, 82, 92, 89, 88, 89, 29, 89, 92, 73, 92, 93, 114, 119, 125, 117, 62, 118, Byte.MAX_VALUE, 110, 110, 123, 112, 123, 122, 62, 113, 112, 62, 114, 113, 125, 117, 109, 125, 108, 123, 123, 112, 62, Byte.MAX_VALUE, 122, 104, 71, 66, 72, 64, 11, 71, 68, 76, 76, 78, 79, 45, 26, 26, 7, 26, 72, 13, 16, 13, 11, 29, 28, 1, 6, 15, 72, 9, 11, 28, 1, 7, 6, 64, 66, 81, 71, 64, 77, 87, 54, 52, 39, 49, 60, 59, 49, 92, 75, 48, 45, 34, 51, 48, 43, 44, 55, 66, 93, 81, 67};
    }

    static {
        A04();
        A0C = C1670da.class.getSimpleName();
    }

    public C1670da(C1400Xy c1400Xy) {
        this(c1400Xy, new AnonymousClass11());
    }

    public C1670da(C1400Xy c1400Xy, AnonymousClass11 anonymousClass11) {
        this.A00 = 200;
        this.A01 = anonymousClass11;
        this.A09 = c1400Xy;
    }

    private Map<String, String> A03(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        String A02 = A02(116, 4, 94);
        if (map.containsKey(A02)) {
            hashMap.put(A02, map.get(A02));
        }
        String A022 = A02(108, 8, 41);
        if (map.containsKey(A022)) {
            hashMap.put(A022, map.get(A022));
        }
        return hashMap;
    }

    private void A05(AnonymousClass11 anonymousClass11) {
        if (!this.A05) {
            this.A01 = anonymousClass11;
            List<AnonymousClass11> A0f = this.A01.A0f();
            if (A0f != null && A0f.size() > 0) {
                int size = A0f.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    C1670da c1670da = new C1670da(this.A09);
                    c1670da.A05(A0f.get(i10));
                    arrayList.add(new UB(this.A09, c1670da, (C9I) null, this.A03));
                }
                this.A04 = arrayList;
            }
            this.A05 = true;
            this.A06 = A07();
            return;
        }
        throw new IllegalStateException(A02(0, 27, 87));
    }

    private void A06(Map<String, String> map, Map<String, String> map2) {
        try {
            Map<String, String> urlParams = A03(map);
            new Handler().postDelayed(new C1671db(this, map2, urlParams), this.A01.A07() * 1000);
        } catch (Exception unused) {
        }
    }

    private boolean A07() {
        if (((!this.A01.A0h() && !TextUtils.isEmpty(this.A01.A0W())) || (!TextUtils.isEmpty(this.A01.A0T()) && this.A01.A0h())) && (this.A01.A0G() != null || this.A01.A0h())) {
            K5 A0F = this.A01.A0F();
            if (A0B[2].length() != 10) {
                throw new RuntimeException();
            }
            A0B[6] = "coz4LHwVNN2LSDndRSBnj9WvwXuRM5HO";
            if (A0F != null || A7B() == AdPlacementType.NATIVE_BANNER) {
                return true;
            }
        }
        return false;
    }

    public final int A08() {
        return this.A01.A02();
    }

    public final int A09() {
        return this.A01.A05();
    }

    public final int A0A() {
        int A06 = this.A01.A06();
        if (A06 < 0 || A06 > 100) {
            return 0;
        }
        return A06;
    }

    public final int A0B() {
        return this.A00;
    }

    public final int A0C() {
        return this.A01.A08();
    }

    public final int A0D() {
        return this.A01.A09();
    }

    public final AnonymousClass11 A0E() {
        return this.A01;
    }

    @Nullable
    public final AnonymousClass12 A0F() {
        return this.A02;
    }

    public final String A0G() {
        return this.A01.A0a();
    }

    @Nullable
    public final List<UB> A0H() {
        if (!A0T()) {
            return null;
        }
        return this.A04;
    }

    public final void A0I() {
        if (!this.A08) {
            String A0b = A0E().A0b();
            if (A0B[2].length() != 10) {
                throw new RuntimeException();
            }
            A0B[5] = "8ArINtb0xmmgo9NmELWQk3NiIhKYvaDc";
            if (A0b != null) {
                this.A09.A08().ADD(A0b);
            }
            this.A08 = true;
        }
    }

    public final void A0J() {
        Iterator<UB> it;
        List<UB> list = this.A04;
        if (list == null) {
            return;
        }
        boolean isEmpty = list.isEmpty();
        if (A0B[6].charAt(13) != 'D') {
            throw new RuntimeException();
        }
        A0B[6] = "kj4WnsmCok25qDrlf1kxSYggARLvW33C";
        if (!isEmpty) {
            List<UB> list2 = this.A04;
            if (A0B[2].length() != 10) {
                it = list2.iterator();
            } else {
                A0B[2] = "wGXHpE1nya";
                it = list2.iterator();
            }
            while (true) {
                boolean hasNext = it.hasNext();
                if (A0B[2].length() != 10) {
                    A0B[6] = "0lb5BUzW8n1EJDWyWAqaA7d0lZJNpkzV";
                    if (!hasNext) {
                        return;
                    }
                } else {
                    A0B[5] = "QJQdkpg5cmGOeaue26HVF3aLtsB2qwfM";
                    if (!hasNext) {
                        return;
                    }
                }
                UB internalNativeAd = it.next();
                internalNativeAd.unregisterView();
            }
        }
    }

    public final void A0K(AnonymousClass12 anonymousClass12) {
        this.A02 = anonymousClass12;
    }

    public final void A0L(C1400Xy c1400Xy, AnonymousClass12 anonymousClass12, InterfaceC1028Jh interfaceC1028Jh, C06071q c06071q, K4 k42) {
        int i10;
        this.A02 = anonymousClass12;
        this.A03 = k42;
        JSONObject A03 = c06071q.A03();
        C9I A01 = c06071q.A01();
        if (A01 != null) {
            i10 = A01.A06();
        } else {
            i10 = 200;
        }
        this.A00 = i10;
        A05(AnonymousClass13.A00(c1400Xy, A03, C1091Lx.A02(A03, A02(106, 2, 85))));
        if (C05750j.A03(c1400Xy, this, interfaceC1028Jh)) {
            c1400Xy.A0D().A41();
            anonymousClass12.ABe(this, KH.A00(AdErrorType.NO_FILL));
        } else if (anonymousClass12 != null) {
            anonymousClass12.ABb(this);
        }
    }

    public final void A0M(Map<String, String> urlParams) {
        if (!A0T()) {
            return;
        }
        if (JR.A1N(this.A09) && MT.A03(urlParams)) {
            String str = A0C;
            if (A0B[4].charAt(15) != 'f') {
                throw new RuntimeException();
            }
            A0B[6] = "D3JUlaax70Z19DqZX7Vx94n8SobUQcIP";
            Log.e(str, A02(27, 31, 116));
            return;
        }
        HashMap hashMap = new HashMap();
        if (urlParams != null) {
            hashMap.putAll(urlParams);
        }
        C1076Lg.A02(this.A09, A02(58, 12, 65));
        AnonymousClass12 anonymousClass12 = this.A02;
        if (anonymousClass12 != null) {
            anonymousClass12.ABa(this);
        }
        if (this.A01.A0h()) {
            hashMap.put(A02(99, 7, 63), String.valueOf(A0E().A04()));
            hashMap.put(A02(92, 7, 73), String.valueOf(A0E().A03()));
        }
        C1400Xy c1400Xy = this.A09;
        AbstractC05710f adAction = C05720g.A00(c1400Xy, c1400Xy.A08(), this.A01.A0Y(), this.A01.A0B(), hashMap);
        if (adAction != null) {
            try {
                adAction.A0C();
            } catch (Exception e10) {
                Log.e(A0C, A02(70, 22, 2), e10);
            }
        }
    }

    public final void A0N(Map<String, String> map) {
        this.A09.A08().A8u(this.A01.A0Y(), map);
    }

    public final void A0O(Map<String, String> map) {
        if (A0T() && !this.A07) {
            AnonymousClass12 anonymousClass12 = this.A02;
            if (anonymousClass12 != null) {
                anonymousClass12.ABc(this);
            }
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            if (this.A01.A0h()) {
                hashMap.put(A02(99, 7, 63), String.valueOf(A0E().A04()));
                hashMap.put(A02(92, 7, 73), String.valueOf(A0E().A03()));
            }
            if (!TextUtils.isEmpty(A65())) {
                if (!this.A01.A0h()) {
                    this.A09.A0D().A2Y();
                    AnonymousClass29.A00(this.A01.A0Z());
                }
                this.A09.A08().A93(A65(), hashMap);
            }
            if (A0V() || A0W()) {
                A06(map, hashMap);
            }
            this.A07 = true;
        }
    }

    public final void A0P(Map<String, String> map) {
        this.A09.A08().A9N(this.A01.A0Y(), map);
    }

    public final void A0Q(Map<String, String> map) {
        this.A09.A08().A9O(this.A01.A0Y(), map);
    }

    public final boolean A0R() {
        return true;
    }

    public final boolean A0S() {
        return A0T() && this.A01.A0B() != null;
    }

    public final boolean A0T() {
        return this.A05 && this.A06;
    }

    public final boolean A0U() {
        return this.A01.A0g();
    }

    public final boolean A0V() {
        if (JR.A0z(this.A09) && A0T()) {
            boolean A0i = this.A01.A0i();
            if (A0B[4].charAt(15) != 'f') {
                throw new RuntimeException();
            }
            A0B[6] = "hsrOxssvGH6abDOIeI9T6FJFSNjQSl4a";
            if (A0i) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0W() {
        if (JR.A0z(this.A09) && A0T()) {
            boolean A0j = this.A01.A0j();
            String[] strArr = A0B;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A0B[2] = "qputmJyOXU";
            if (A0j) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05740i
    public final String A65() {
        return this.A01.A0Y();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05740i
    @Nullable
    public final Collection<String> A6O() {
        return A0E().A0e();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05740i
    @Nullable
    public final EnumC05730h A6p() {
        return A0E().A0C();
    }

    public AdPlacementType A7B() {
        return AdPlacementType.NATIVE;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05780n
    public final void onDestroy() {
    }
}

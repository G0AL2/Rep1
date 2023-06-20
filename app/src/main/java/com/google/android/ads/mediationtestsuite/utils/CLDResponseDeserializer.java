package com.google.android.ads.mediationtestsuite.utils;

import com.google.android.ads.mediationtestsuite.dataobjects.AdFormat;
import com.google.android.ads.mediationtestsuite.dataobjects.AdUnitResponse;
import com.google.android.ads.mediationtestsuite.dataobjects.CLDResponse;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class CLDResponseDeserializer implements com.google.gson.g<CLDResponse> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends com.google.gson.reflect.a<List<AdUnitResponse>> {
        a(CLDResponseDeserializer cLDResponseDeserializer) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f20901a;

        static {
            int[] iArr = new int[AdFormat.values().length];
            f20901a = iArr;
            try {
                iArr[AdFormat.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    @Override // com.google.gson.g
    /* renamed from: a */
    public CLDResponse deserialize(com.google.gson.h hVar, Type type, com.google.gson.f fVar) {
        ArrayList arrayList = new ArrayList();
        for (AdUnitResponse adUnitResponse : (List) fVar.a(hVar.f().p("ad_unit_settings"), new a(this).e())) {
            if (b.f20901a[adUnitResponse.e().ordinal()] != 1) {
                arrayList.add(adUnitResponse);
            }
        }
        CLDResponse cLDResponse = new CLDResponse();
        cLDResponse.b(arrayList);
        return cLDResponse;
    }
}

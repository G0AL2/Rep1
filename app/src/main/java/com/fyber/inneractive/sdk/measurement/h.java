package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.q;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class h implements com.fyber.inneractive.sdk.response.i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List f17345a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f17346b;

    public h(i iVar, List list, j jVar) {
        this.f17345a = list;
        this.f17346b = jVar;
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public List<String> a(q qVar) {
        if (this.f17345a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.f17345a) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str.replace("[REASON]", String.valueOf(this.f17346b.f17357a)));
            }
        }
        return arrayList;
    }
}

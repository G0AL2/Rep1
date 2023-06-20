package com.fyber.inneractive.sdk.util;

import android.location.Location;
import com.fyber.inneractive.sdk.util.i;
import com.google.android.gms.tasks.OnSuccessListener;

/* loaded from: classes2.dex */
public class h implements OnSuccessListener<Location> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i.a f20280a;

    public h(i.a aVar) {
        this.f20280a = aVar;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Location location) {
        Location location2 = location;
        i.a aVar = this.f20280a;
        if (aVar != null) {
            ((v) aVar).f20345a.f20357b = location2;
        }
    }
}

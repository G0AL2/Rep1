package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PickerFragment.java */
/* loaded from: classes2.dex */
public abstract class l<S> extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    protected final LinkedHashSet<k<S>> f22355a = new LinkedHashSet<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(k<S> kVar) {
        return this.f22355a.add(kVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.f22355a.clear();
    }
}

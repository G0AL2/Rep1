package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final /* synthetic */ class l2 implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    static final FilenameFilter f22911a = new l2();

    private l2() {
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean matches;
        matches = m2.f22915a.matcher(str).matches();
        return matches;
    }
}

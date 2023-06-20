package com.bytedance.sdk.openadsdk.core.video.b;

import com.bytedance.sdk.component.utils.f;
import java.io.File;
import java.util.List;

/* compiled from: TotalCountLruDiskDir.java */
/* loaded from: classes.dex */
public class c extends com.bytedance.sdk.openadsdk.a.b {
    public c(int i10, int i11) {
        super(i10, i11);
    }

    @Override // com.bytedance.sdk.openadsdk.a.b, com.bytedance.sdk.openadsdk.a.a
    protected void a(List<File> list) {
        int size = list.size();
        if (a(0L, size)) {
            return;
        }
        for (File file : list) {
            f.c(file);
            size--;
            if (a(file, 0L, size)) {
                return;
            }
        }
    }
}

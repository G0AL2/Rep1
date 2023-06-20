package com.bytedance.sdk.openadsdk.a;

import com.bytedance.sdk.component.utils.l;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: TotalCountLruDiskFile.java */
/* loaded from: classes.dex */
public class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private int f10643a;

    /* renamed from: b  reason: collision with root package name */
    private int f10644b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f10645c;

    public b(int i10, int i11) {
        this.f10643a = 15;
        this.f10644b = 3;
        if (i10 > 0) {
            this.f10643a = i10;
            this.f10644b = i11;
            return;
        }
        throw new IllegalArgumentException("Max count must be positive number!");
    }

    private void c(List<File> list) {
        long b10 = b(list);
        int size = list.size();
        if (a(b10, size)) {
            return;
        }
        for (File file : list) {
            long length = file.length();
            if (file.delete()) {
                size--;
                b10 -= length;
                l.c("TotalCountLruDiskFile", "Cache file " + file + " is deleted because it exceeds cache limit");
            } else {
                l.c("TotalCountLruDiskFile", "Error deleting file " + file + " for trimming cache");
            }
            if (a(file, b10, size)) {
                return;
            }
        }
    }

    private void d(List<File> list) {
        if (list != null) {
            try {
                if (list.size() == 0) {
                    return;
                }
                long b10 = b(list);
                int size = list.size();
                boolean a10 = a(b10, size);
                if (a10) {
                    l.c("splashLoadAd", "Do not meet the delete condition, do not perform a delete operation(true)" + a10);
                    return;
                }
                TreeMap treeMap = new TreeMap();
                for (File file : list) {
                    treeMap.put(Long.valueOf(file.lastModified()), file);
                }
                for (Map.Entry entry : treeMap.entrySet()) {
                    if (entry != null && !a10) {
                        l.e("splashLoadAd", "LRUDeleteFile deleting fileTime " + ((Long) entry.getKey()).longValue());
                        File file2 = (File) entry.getValue();
                        long length = file2.length();
                        if (file2.delete()) {
                            size--;
                            b10 -= length;
                            l.c("splashLoadAd", "Delete, the current total number of a Cache file：" + size);
                        } else {
                            l.e("splashLoadAd", "Error deleting file " + file2 + " for trimming cache");
                        }
                        if (a(file2, b10, size)) {
                            l.c("splashLoadAd", "Stop deleting, the current total number totalCount：" + size + " Maximum storage limit number maxCount " + this.f10643a + " Minimum number " + this.f10644b);
                            return;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.a.a
    public boolean a(long j10, int i10) {
        return i10 <= this.f10643a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.a.a
    public boolean a(File file, long j10, int i10) {
        return i10 <= this.f10644b;
    }

    @Override // com.bytedance.sdk.openadsdk.a.a
    protected void a(List<File> list) {
        if (this.f10645c) {
            d(list);
            this.f10645c = false;
            return;
        }
        c(list);
    }

    public b(int i10, int i11, boolean z10) {
        this.f10643a = 15;
        this.f10644b = 3;
        if (i10 > 0) {
            this.f10643a = i10;
            this.f10644b = i11;
            this.f10645c = z10;
            return;
        }
        throw new IllegalArgumentException("Max count must be positive number!");
    }
}

package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes3.dex */
final class d0 extends cb.u {

    /* renamed from: a  reason: collision with root package name */
    private final File f22793a;

    /* renamed from: b  reason: collision with root package name */
    private final File f22794b;

    /* renamed from: c  reason: collision with root package name */
    private final NavigableMap<Long, File> f22795c = new TreeMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0(File file, File file2) throws IOException {
        this.f22793a = file;
        this.f22794b = file2;
        List<File> a10 = m2.a(file, file2);
        if (a10.isEmpty()) {
            throw new s0(String.format("Virtualized slice archive empty for %s, %s", file, file2));
        }
        int size = a10.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            File file3 = a10.get(i10);
            this.f22795c.put(Long.valueOf(j10), file3);
            j10 += file3.length();
        }
    }

    private final InputStream e(long j10, Long l10) throws IOException {
        FileInputStream fileInputStream = new FileInputStream((File) this.f22795c.get(l10));
        if (fileInputStream.skip(j10 - l10.longValue()) == j10 - l10.longValue()) {
            return fileInputStream;
        }
        throw new s0(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", l10));
    }

    @Override // cb.u
    public final long a() {
        Map.Entry<Long, File> lastEntry = this.f22795c.lastEntry();
        return lastEntry.getKey().longValue() + lastEntry.getValue().length();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cb.u
    public final InputStream b(long j10, long j11) throws IOException {
        if (j10 < 0 || j11 < 0) {
            throw new s0(String.format("Invalid input parameters %s, %s", Long.valueOf(j10), Long.valueOf(j11)));
        }
        long j12 = j10 + j11;
        if (j12 <= a()) {
            Long floorKey = this.f22795c.floorKey(Long.valueOf(j10));
            Long floorKey2 = this.f22795c.floorKey(Long.valueOf(j12));
            if (floorKey.equals(floorKey2)) {
                return new c0(e(j10, floorKey), j11);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(e(j10, floorKey));
            Collection<File> values = this.f22795c.subMap(floorKey, false, floorKey2, false).values();
            if (!values.isEmpty()) {
                arrayList.add(new v1(Collections.enumeration(values)));
            }
            arrayList.add(new c0(new FileInputStream((File) this.f22795c.get(floorKey2)), j11 - (floorKey2.longValue() - j10)));
            return new SequenceInputStream(Collections.enumeration(arrayList));
        }
        throw new s0(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", Long.valueOf(a()), Long.valueOf(j12)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

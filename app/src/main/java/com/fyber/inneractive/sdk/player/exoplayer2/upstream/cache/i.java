package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.util.Log;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, h> f19427a;

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<String> f19428b;

    /* renamed from: c  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.b f19429c;

    /* renamed from: d  reason: collision with root package name */
    public final Cipher f19430d;

    /* renamed from: e  reason: collision with root package name */
    public final SecretKeySpec f19431e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f19432f;

    /* renamed from: g  reason: collision with root package name */
    public o f19433g;

    public i(File file, byte[] bArr) {
        if (bArr != null) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(bArr.length == 16);
            try {
                this.f19430d = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                this.f19431e = new SecretKeySpec(bArr, "AES");
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e10) {
                throw new IllegalStateException(e10);
            }
        } else {
            this.f19430d = null;
            this.f19431e = null;
        }
        this.f19427a = new HashMap<>();
        this.f19428b = new SparseArray<>();
        this.f19429c = new com.fyber.inneractive.sdk.player.exoplayer2.util.b(new File(file, "cached_content_index.exi"));
    }

    public h a(String str) {
        return this.f19427a.get(str);
    }

    public void b(String str) {
        h remove = this.f19427a.remove(str);
        if (remove != null) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(remove.f19425c.isEmpty());
            this.f19428b.remove(remove.f19423a);
            this.f19432f = true;
        }
    }

    public void c() throws a.C0261a {
        DataOutputStream dataOutputStream;
        IOException e10;
        Throwable th;
        if (this.f19432f) {
            DataOutputStream dataOutputStream2 = null;
            try {
                OutputStream b10 = this.f19429c.b();
                o oVar = this.f19433g;
                if (oVar == null) {
                    this.f19433g = new o(b10);
                } else {
                    oVar.a(b10);
                }
                dataOutputStream = new DataOutputStream(this.f19433g);
            } catch (IOException e11) {
                dataOutputStream = dataOutputStream2;
                e10 = e11;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                dataOutputStream = dataOutputStream2;
                th = th3;
                u.a(dataOutputStream);
                throw th;
            }
            try {
                dataOutputStream.writeInt(1);
                dataOutputStream.writeInt(this.f19430d != null ? 1 : 0);
                if (this.f19430d != null) {
                    byte[] bArr = new byte[16];
                    new Random().nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        this.f19430d.init(1, this.f19431e, new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        dataOutputStream2 = new DataOutputStream(new CipherOutputStream(this.f19433g, this.f19430d));
                    } catch (InvalidAlgorithmParameterException e12) {
                        e = e12;
                        throw new IllegalStateException(e);
                    } catch (InvalidKeyException e13) {
                        e = e13;
                        throw new IllegalStateException(e);
                    }
                } else {
                    dataOutputStream2 = dataOutputStream;
                }
                dataOutputStream2.writeInt(this.f19427a.size());
                int i10 = 0;
                for (h hVar : this.f19427a.values()) {
                    dataOutputStream2.writeInt(hVar.f19423a);
                    dataOutputStream2.writeUTF(hVar.f19424b);
                    dataOutputStream2.writeLong(hVar.f19426d);
                    i10 += hVar.a();
                }
                dataOutputStream2.writeInt(i10);
                com.fyber.inneractive.sdk.player.exoplayer2.util.b bVar = this.f19429c;
                bVar.getClass();
                dataOutputStream2.close();
                bVar.f19545b.delete();
                int i11 = u.f19606a;
                this.f19432f = false;
            } catch (IOException e14) {
                e10 = e14;
                try {
                    throw new a.C0261a(e10);
                } catch (Throwable th4) {
                    DataOutputStream dataOutputStream3 = dataOutputStream;
                    th = th4;
                    dataOutputStream2 = dataOutputStream3;
                    Throwable th32 = th;
                    dataOutputStream = dataOutputStream2;
                    th = th32;
                    u.a(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                u.a(dataOutputStream);
                throw th;
            }
        }
    }

    public final boolean a() {
        DataInputStream dataInputStream;
        DataInputStream dataInputStream2 = null;
        try {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f19429c.a());
                dataInputStream = new DataInputStream(bufferedInputStream);
                try {
                    if (dataInputStream.readInt() != 1) {
                        u.a(dataInputStream);
                        return false;
                    }
                    if ((dataInputStream.readInt() & 1) != 0) {
                        if (this.f19430d == null) {
                            u.a(dataInputStream);
                            return false;
                        }
                        byte[] bArr = new byte[16];
                        dataInputStream.readFully(bArr);
                        try {
                            this.f19430d.init(2, this.f19431e, new IvParameterSpec(bArr));
                            dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.f19430d));
                        } catch (InvalidAlgorithmParameterException e10) {
                            e = e10;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e11) {
                            e = e11;
                            throw new IllegalStateException(e);
                        }
                    } else {
                        if (this.f19430d != null) {
                            this.f19432f = true;
                        }
                        dataInputStream2 = dataInputStream;
                    }
                    int readInt = dataInputStream2.readInt();
                    int i10 = 0;
                    for (int i11 = 0; i11 < readInt; i11++) {
                        h hVar = new h(dataInputStream2.readInt(), dataInputStream2.readUTF(), dataInputStream2.readLong());
                        a(hVar);
                        i10 += hVar.a();
                    }
                    if (dataInputStream2.readInt() != i10) {
                        u.a(dataInputStream2);
                        return false;
                    }
                    u.a(dataInputStream2);
                    return true;
                } catch (FileNotFoundException unused) {
                    if (dataInputStream != null) {
                        u.a(dataInputStream);
                    }
                    return false;
                } catch (IOException e12) {
                    e = e12;
                    dataInputStream2 = dataInputStream;
                    Log.e("CachedContentIndex", "Error reading cache content index file.", e);
                    if (dataInputStream2 != null) {
                        u.a(dataInputStream2);
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    if (dataInputStream != null) {
                        u.a(dataInputStream);
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused2) {
                dataInputStream = dataInputStream2;
            } catch (IOException e13) {
                e = e13;
            }
        } catch (Throwable th2) {
            th = th2;
            dataInputStream = null;
        }
    }

    public void b() {
        LinkedList linkedList = new LinkedList();
        for (h hVar : this.f19427a.values()) {
            if (hVar.f19425c.isEmpty()) {
                linkedList.add(hVar.f19424b);
            }
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            b((String) it.next());
        }
    }

    public final void a(h hVar) {
        this.f19427a.put(hVar.f19424b, hVar);
        this.f19428b.put(hVar.f19423a, hVar.f19424b);
    }

    public final h a(String str, long j10) {
        SparseArray<String> sparseArray = this.f19428b;
        int size = sparseArray.size();
        int i10 = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i10 < size && i10 == sparseArray.keyAt(i10)) {
                i10++;
            }
            keyAt = i10;
        }
        h hVar = new h(keyAt, str, j10);
        this.f19427a.put(str, hVar);
        this.f19428b.put(keyAt, str);
        this.f19432f = true;
        return hVar;
    }
}

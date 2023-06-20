package com.vehiclecloud.app.videofetch.rndownloader.service.connection;

import android.os.SystemClock;
import android.os.storage.StorageManager;
import android.util.Log;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResourceHeader;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadTaskBase;
import com.vehiclecloud.app.videofetch.rndownloader.service.DownloadWorker;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.util.Collection;

/* loaded from: classes3.dex */
public abstract class FileDownloadListener<T extends DownloadTaskBase> implements DownloadConnectionListener {
    public static final String TAG = "FileDownloadListener";
    protected final Collection<DownloadResourceHeader> headers;
    private RandomAccessFile mRandomAccessFile;
    private long mSpeed;
    private long mSpeedSampleBytes;
    private long mSpeedSampleStart;
    private final StorageManager mStorage;
    protected boolean resuming;
    protected final T task;
    protected final DownloadWorker worker;
    private boolean mMadeProgress = false;
    private long mLastUpdateBytes = 0;
    private long mLastUpdateTime = 0;

    public FileDownloadListener(DownloadWorker downloadWorker, T t10, Collection<DownloadResourceHeader> collection) {
        boolean z10 = false;
        this.worker = downloadWorker;
        this.task = t10;
        this.headers = collection;
        if (t10.acceptPartial != 0 && (t10.currentBytes > 0 || t10.rangeStart > 0 || t10.rangeEnd > 0)) {
            z10 = true;
        }
        this.resuming = z10;
        this.mStorage = (StorageManager) downloadWorker.getApplicationContext().getSystemService("storage");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0106 A[Catch: all -> 0x0102, IOException -> 0x0113, TRY_LEAVE, TryCatch #14 {IOException -> 0x0113, all -> 0x0102, blocks: (B:76:0x00fe, B:80:0x0106), top: B:99:0x00fe }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void transferData(java.net.HttpURLConnection r13) throws com.vehiclecloud.app.videofetch.rndownloader.service.connection.StopRequestException {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vehiclecloud.app.videofetch.rndownloader.service.connection.FileDownloadListener.transferData(java.net.HttpURLConnection):void");
    }

    private void updateProgress(FileDescriptor fileDescriptor, boolean z10) throws IOException {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        T t10 = this.task;
        long j10 = t10.currentBytes;
        long j11 = this.mSpeedSampleStart;
        long j12 = elapsedRealtime - j11;
        if (j12 > 500 || z10) {
            long j13 = (j10 - this.mSpeedSampleBytes) * 1000;
            if (j12 == 0) {
                j12 = 500;
            }
            long j14 = j13 / j12;
            long j15 = this.mSpeed;
            if (j15 == 0) {
                this.mSpeed = j14;
            } else {
                this.mSpeed = ((j15 * 3) + j14) / 4;
            }
            if (j11 != 0) {
                long j16 = this.mSpeed;
                t10.speed = j16;
                onProgress(t10.totalBytes, j10, j16);
            }
            this.mSpeedSampleStart = elapsedRealtime;
            this.mSpeedSampleBytes = j10;
        }
        long j17 = elapsedRealtime - this.mLastUpdateTime;
        if ((j10 - this.mLastUpdateBytes <= 65536 || j17 <= Constants.MIN_PROGRESS_TIME) && !z10) {
            return;
        }
        fileDescriptor.sync();
        updateTask();
        this.mLastUpdateBytes = j10;
        this.mLastUpdateTime = elapsedRealtime;
    }

    protected int getTaskStatusFromDB() {
        return this.task.status;
    }

    protected long getTaskTotalBytes() {
        return this.task.totalBytes;
    }

    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
    public void onException(StopRequestException stopRequestException) throws StopRequestException {
        Log.w(TAG, "FileDownloadListener uri:" + this.task.uri + ", Stop requested with status " + stopRequestException.getFinalStatus() + ": " + stopRequestException.getMessage() + ":" + this.task.numFailed);
        if (getTaskStatusFromDB() != 490) {
            this.task.status = this.worker.isStopped() ? DownloadResource.STATUS_PAUSED_BY_APP : stopRequestException.getFinalStatus();
        } else {
            this.task.status = DownloadResource.STATUS_CANCELED;
        }
        T t10 = this.task;
        t10.speed = 0L;
        if (Helpers.isStatusRetryable(t10.status)) {
            if (this.mMadeProgress) {
                this.task.numFailed = 1;
            } else {
                this.task.numFailed++;
            }
            T t11 = this.task;
            if (t11.numFailed < 5) {
                t11.status = DownloadResource.STATUS_WAITING_TO_RETRY;
            }
        }
        updateTask();
    }

    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
    public void onFinished() throws StopRequestException {
        T t10 = this.task;
        t10.status = 200;
        t10.downloadEndOn = System.currentTimeMillis();
        updateTask();
    }

    protected void onHeaderParsed() {
    }

    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
    public /* synthetic */ void onMovedPerm(String str) {
        a.c(this, str);
    }

    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
    public void onOk(HttpURLConnection httpURLConnection) {
        parseOkHeaders(httpURLConnection);
        transferData(httpURLConnection);
    }

    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
    public void onPartial(HttpURLConnection httpURLConnection) {
        transferData(httpURLConnection);
    }

    protected abstract void onProgress(long j10, long j11, long j12);

    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
    public void onStart(HttpURLConnection httpURLConnection) {
        T t10 = this.task;
        t10.status = DownloadResource.STATUS_RUNNING;
        if (!this.resuming) {
            t10.downloadStartedOn = System.currentTimeMillis();
            T t11 = this.task;
            if (t11.currentBytes > 0) {
                t11.currentBytes = 0L;
            }
        }
        updateTask();
        if (this.resuming) {
            String str = this.task.eTag;
            if (str != null) {
                httpURLConnection.addRequestProperty("If-Match", str);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bytes=");
            T t12 = this.task;
            sb2.append(t12.rangeStart + t12.currentBytes);
            sb2.append(Constants.FILENAME_SEQUENCE_SEPARATOR);
            long j10 = this.task.rangeEnd;
            sb2.append(j10 > 0 ? Long.valueOf(j10) : "");
            httpURLConnection.addRequestProperty("Range", sb2.toString());
        }
    }

    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
    public /* synthetic */ void onUnavailable(HttpURLConnection httpURLConnection) {
        a.g(this, httpURLConnection);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean parseOkHeaders(HttpURLConnection httpURLConnection) {
        boolean parseHeader = Helpers.parseHeader(httpURLConnection, this.task);
        if (parseHeader) {
            onHeaderParsed();
            updateTask();
        }
        return parseHeader;
    }

    protected abstract void updateTask();

    private void transferData(InputStream inputStream, OutputStream outputStream, FileDescriptor fileDescriptor) throws StopRequestException {
        byte[] bArr = new byte[Constants.BUFFER_SIZE];
        while (!this.worker.isStopped()) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    try {
                        updateProgress(fileDescriptor, true);
                        T t10 = this.task;
                        long j10 = t10.totalBytes;
                        if (j10 == -1 || t10.currentBytes == j10) {
                            return;
                        }
                        throw new StopRequestException((int) DownloadResource.STATUS_HTTP_DATA_ERROR, "Content length mismatch; found " + this.task.currentBytes + " instead of " + this.task.totalBytes);
                    } catch (IOException e10) {
                        throw new StopRequestException((int) DownloadResource.STATUS_FILE_ERROR, e10);
                    }
                }
                try {
                    outputStream.write(bArr, 0, read);
                    this.mMadeProgress = true;
                    this.task.currentBytes += read;
                    updateProgress(fileDescriptor, false);
                } catch (IOException e11) {
                    throw new StopRequestException((int) DownloadResource.STATUS_FILE_ERROR, e11);
                }
            } catch (IOException e12) {
                throw new StopRequestException(DownloadResource.STATUS_HTTP_DATA_ERROR, "Failed reading response: " + e12, e12);
            }
        }
        throw new StopRequestException((int) DownloadResource.STATUS_PAUSED_BY_APP, "Local halt requested; job probably timed out");
    }
}

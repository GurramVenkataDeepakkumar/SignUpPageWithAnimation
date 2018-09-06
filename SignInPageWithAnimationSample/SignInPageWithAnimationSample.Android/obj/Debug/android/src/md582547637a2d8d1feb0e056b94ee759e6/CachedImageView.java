package md582547637a2d8d1feb0e056b94ee759e6;


public class CachedImageView
	extends ffimageloading.views.ImageViewAsync
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_invalidate:()V:GetInvalidateHandler\n" +
			"";
		mono.android.Runtime.register ("FFImageLoading.Forms.Platform.CachedImageView, FFImageLoading.Forms.Platform, Version=2.4.3.840, Culture=neutral, PublicKeyToken=null", CachedImageView.class, __md_methods);
	}


	public CachedImageView (android.content.Context p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == CachedImageView.class)
			mono.android.TypeManager.Activate ("FFImageLoading.Forms.Platform.CachedImageView, FFImageLoading.Forms.Platform, Version=2.4.3.840, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public CachedImageView (android.content.Context p0, android.util.AttributeSet p1) throws java.lang.Throwable
	{
		super (p0, p1);
		if (getClass () == CachedImageView.class)
			mono.android.TypeManager.Activate ("FFImageLoading.Forms.Platform.CachedImageView, FFImageLoading.Forms.Platform, Version=2.4.3.840, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public CachedImageView (android.content.Context p0, android.util.AttributeSet p1, int p2) throws java.lang.Throwable
	{
		super (p0, p1, p2);
		if (getClass () == CachedImageView.class)
			mono.android.TypeManager.Activate ("FFImageLoading.Forms.Platform.CachedImageView, FFImageLoading.Forms.Platform, Version=2.4.3.840, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public CachedImageView (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) throws java.lang.Throwable
	{
		super (p0, p1, p2, p3);
		if (getClass () == CachedImageView.class)
			mono.android.TypeManager.Activate ("FFImageLoading.Forms.Platform.CachedImageView, FFImageLoading.Forms.Platform, Version=2.4.3.840, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public void invalidate ()
	{
		n_invalidate ();
	}

	private native void n_invalidate ();

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}

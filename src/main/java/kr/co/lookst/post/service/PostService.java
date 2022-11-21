package kr.co.lookst.post.service;

import java.util.List;

import kr.co.lookst.post.domain.PostDto;
import kr.co.lookst.post.domain.Post_imgDto;
import kr.co.lookst.post.domain.ProdInfoDto;
import kr.co.lookst.post.domain.post_com_tagDto;
import kr.co.lookst.post.domain.snslist_infoDto;

public interface PostService {

	List<Post_imgDto> getpostlistimg() throws Exception;
	List<ProdInfoDto> postImgListCarousel(Integer post_no) throws Exception;
	List<snslist_infoDto> postImgListPrdt(Integer post_no) throws Exception;
	List<ProdInfoDto> getprodInfo() throws Exception;
	List<PostDto> snscommentlist(Integer post_no) throws Exception;
	List<post_com_tagDto> postComTaglist(Integer post_no) throws Exception;
}

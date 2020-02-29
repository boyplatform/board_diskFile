package cn.Boy.DiskFile.dao;

import java.util.List;

import cn.Boy.DiskFile.pojo.TvCharacter;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface TvCharacterDao {
    
    @Select("select * from tv_character where id=#{id}")
    public TvCharacter getOneById(int id);
    
    @Select("select * from tv_character where tv_series_id=#{tvSeriesId}")
    public List<TvCharacter> getAllByTvSeriesId(int tvSeriesId);
    
    public int update(TvCharacter tvCharacter);
    public int insert(TvCharacter tvCharacter);
    
    @Delete("delete from tv_character where id=#{id}")
    public int delete(int id);
}

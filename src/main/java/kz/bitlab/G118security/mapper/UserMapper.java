package kz.bitlab.G118security.mapper;

import kz.bitlab.G118security.dto.UserCreate;
import kz.bitlab.G118security.dto.UserUpdate;
import kz.bitlab.G118security.dto.UserView;
import kz.bitlab.G118security.model.User;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(builder = @Builder(disableBuilder = true))
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "fullName", target = "name")
    UserView toView(User entity);

    List<UserView> toViewList(List<User> entityList);

    User toEntity(UserCreate userCreate);

    User toEntity(UserUpdate userUpdate);
}

package com.distributedx.user.users.features.createuser;
import java.util.UUID;
import buildingblocks.core.event.InternalCommand;
import buildingblocks.mediator.abstractions.commands.ICommand;
import com.distributedx.user.users.dtos.UserDto;


public record CreateUserCommand(
        UUID id,
        String userName,
        String fullName,
        String email,
        String password
) implements ICommand<UserDto>, InternalCommand {
    public CreateUserCommand {
    }
}


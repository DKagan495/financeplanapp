package by.kagan.financeplanapplication.controller;

import by.kagan.financeplanapplication.dto.UserDto;
import by.kagan.financeplanapplication.request.filter.UserFilter;
import by.kagan.financeplanapplication.request.user.CreateUserRequest;
import by.kagan.financeplanapplication.request.user.UpdateUserRequest;
import by.kagan.financeplanapplication.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @PostMapping("/create")
    public ResponseEntity<UserDto> create(@RequestBody CreateUserRequest request) {
        return null;
    }

    @PatchMapping("/update")
    public ResponseEntity<UserDto> update(@RequestBody UpdateUserRequest request) {
        return null;
    }

    @PostMapping("/getByFilter")
    public ResponseEntity<List<UserDto>> getByFilter(@RequestBody UserFilter filter, Pageable pageable) {
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getById(@PathVariable Long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable Long id) {
        userService.delete(id);

        return ResponseEntity.ok(HttpStatus.OK);
    }
}

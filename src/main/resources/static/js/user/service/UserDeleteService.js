import{ User } from "../dto/UserDto.js";

export class UserDeleteService {
    static getUserAccount(event) {
        const user = new User(event.target.parentElement.parentElement);
        return user.account;
    }

    static userDelete(event) {
        const account = this.getUserAccount(event);

        if (confirm(account + " 삭제하시겠습니까?")) {
            fetch(`/admin/user/delete/${account}`, {
                method: 'PUT',
            })
                .then(data => {
                    alert("직원을 삭제합니다.");
                    console.log('관리자 확인.', data);
                })
                .catch((error) => {
                    alert("ERROR");
                    console.error(error);
                });
        } else {
            alert("취소하였습니다.");
        }
    }
}
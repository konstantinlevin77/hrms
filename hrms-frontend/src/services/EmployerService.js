import axios from 'axios'

export default class EmployerService{

    getAll() {
        return axios.get("localhost:8080/api/employer/getall");
    }

    add(employer) {
        return axios.post("localhost:8080/api/employer/add",employer)
    }

    verifyEmail(id) {
        return axios.post("localhost:8080/api/employer/verifyEmail",id)
    }

}